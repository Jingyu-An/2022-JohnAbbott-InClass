/* Database I Final Exam Data - June 2022
FSD-05
Your Name: Jingyu An  / 2228416

• THIS IS A CLOSE BOOK EXAM.
• Save this file as Your_Name_DB_FE.
• Submit only this script with all your answers.
• The Exam duration is 3 hours.

Create the BookSales database that contains five tables:
1) Authors,
2) AuthorBook,
3) Publishers,
4) BookPublisher, and
5) Books.

The Books table includes four columns:
	• BookID,
	• BookTitle,
	• Copyright, and
	• PubID.
The primary key in the Books table is made up of the BookID column and no other columns.

The publisher listed in the Publishers table can publish one or more books, and
that publisher is identified by the value in the foreign key column (PubID).

The AuthorBook table includes an FK1 and an FK2 because there are two foreign keys.
The numbers are used because some tables might include multiple foreign keys in which
one or more of those keys are made up of more than one column. The foreign keys in the
AuthorBook table participate in one-to-many relationships with the Authors table and the Books table.

There are generally four steps that you should follow when developing a data model:
❑ Identifying the potential entities that will exist in the database
❑ Normalizing the data design to support data storage in the identified entities
❑ Identifying the relationships that exist between tables
❑ Refining the data model to ensure full normalization


The first step in developing a data model is to identify the objects (entities and attributes)
that represent the type of data stored in your database. The purpose of this step is to name
any types of information, categories, or actions that require the storage of data in the database.
*/

/* ******************************************** */
/* 1. Create the BookSales_Your_FirstName database that  */
create database BookSalesJingyu
;

/* ******************************************** */
/*switch to booksales database */
use BookSalesJingyu
;

/* ******************************************** */
/* 2. Creating Tables.  */
/* NOTE: Do not apply foerign key constraints at this time,
you will add them later in step 4. Implementing Data
Integrity by Using Constraints. */

/* ***** 2.1. create the Publishers table  ***** */
create table Publishers
(
    PubID SMALLINT not null ,
    PubName varchar(40) not null ,
    PubCity varchar(20) not null ,
    PubState CHAR(2) not null ,
    constraint pk_Publishers primary key (PubID asc)
)
;

-- display the definition of the table Publishers
select *
from Publishers
;


/* ******************************************** */

/* ***** 2.2. create the Authors table  ******/
create table Authors
(
    AuthID smallint not null ,
    AuthFN varchar(20) not null ,
    AuthMN varchar(20) not null ,
    AuthLN varchar(20)  not null ,
    Born year not null ,
    Died year null ,
    constraint pk_Authors primary key (AuthID asc)
)
;

/* ******************************************** */
/* ***** 2.3. create the Books table  ***** */
create table Books
(
    BookID smallint not null ,
    BookTitle varchar(60) not null ,
    Copyright date not null ,
    PubID smallint not null ,
    constraint pk_Books primary key (BookID asc)
)
;

/* ******************************************** */
/* ***** 2.4. create the AuthorBook table  ***** */
create table AuthorBook
(
    AuthID smallint not null ,
    BookID smallint not null ,
    constraint pk_AuthorBook primary key
        (
             AuthID asc ,
             BookID asc
        )
)
;


/* ******************************************** */
/* ***** 2.5. create the BookPublisher table  ***** */
create table BookPublisher
(
    PubID smallint not null ,
    BookID smallint not null ,
    constraint pk_BookPublisher primary key
        (
             PubID asc ,
             BookID asc
        )
)
;

/* ***** 3. Modify the definition of the following objects using scripts: */

/* ***** 3.1 delete the column PubID from the table Books */
alter table Books
    drop PubID
;
/* ***** 3.2. Publisher: add publisher country ***** */
alter table Publishers
    add PubContry nvarchar(15) not null
;

/* ***** 3.3. Author: add the author address (address, city, state, postalcode, country) **** */
alter table Authors
    add AuthAddress varchar(40) not null ,
    add AuthCity varchar(30) not null ,
    add AuthState varchar(2) not null ,
    add AuthZip varchar(10) not null ,
    add AuthContry nvarchar(15) not null
;

/* ******************************************** */
/* 4. Implementing Data Integrity by Using Constraints
/* ******************************************** */

-- Foreign key constraint(s)
-- 4.1. Between AuthorBook and Authors tables
alter table AuthorBook
	add constraint fk_AuthorBook_Authors foreign key (AuthID)
		references Authors (AuthID)
;

-- 4.2. Between AuthorBook and Books tables
alter table AuthorBook
	add constraint fk_AuthorBook_Books foreign key (BookID)
		references Books (BookID)
;

-- 4.3. Between BookPublisher and Books tables
alter table BookPublisher
	add constraint fk_BookPublisher_Books foreign key (BookID)
		references Books (BookID)
;

-- 4.4. Between BookPublisher and Publishers tables
alter table BookPublisher
	add constraint fk_BookPublisher_Publishers foreign key (PubID)
		references Publishers (PubID)
;

/* ******************************************** */
-- 4.5. set the default author middle name to null
alter table Authors
		alter column AuthMN
        set default null
;

-- 4.6. set the book title as a unique constraint
alter table Books
        add constraint uq_BookTitle_Books unique (BookTitle)
;


-- 4.7. add a check constraint to the Author table on Died
-- columnm to be greater than the Born column
alter table Authors
	add constraint ck_Born_Died_Authors check (Died > Born)
;

/* ******************************************** */
/*
5. Populate all tables with data through script data entry
(using insert into/ values and bulk insert).
Data files are attached to the exam as csv files.
*/

/*
NOTE: Only write the script - no need to physically import the data
*/
-- load data from external .cvs file

-- 5.1. Publishers table
load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Publishers.csv'
into table Publishers
fields terminated by ','
lines terminated by '\r\n'
ignore 1 lines
;

/* ******************************************** */
-- 5.2. Authors table
load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Authors.csv'
into table Authors
fields terminated by ','
lines terminated by '\r\n'
ignore 1 lines
;

/* ******************************************** */
-- 5.3. AuthorBook table
load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/AuthorBook.csv'
into table AuthorBook
fields terminated by ','
lines terminated by '\r\n'
ignore 1 lines
;

/* ******************************************** */
-- 5.4. BookPublisher table
load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/BookPublisher.csv'
into table BookPublisher
fields terminated by ','
lines terminated by '\r\n'
ignore 1 lines
;

/* ******************************************** */



/* ******************************************** */
/* ***** 6. Manipulate Data ***** */

/* 6.1. Retrieve all author id and prevent duplicated values in the Author Book table */
select distinct AuthID
from AuthorBook
;

/* 6.2. Find out how many authors published more than 5 books */
select CONCAT(AuthFN, AuthMN, AuthLN) as 'Name', count(BookID) as 'Number of books published'
from authorbook
    inner join authors a on AuthorBook.AuthID = a.AuthID
group by 'Name'
having count(BookID) >= 5
;

/* 6.3. Find out how many books were published by each publisher */
select PubName, count(BookID) as 'Number of books were published'
from BookPublisher
    inner join publishers p on BookPublisher.PubID = p.PubID
group by PubName
;

/* 6.4. Return author full name and full address */
select CONCAT(AuthFN, AuthMN, AuthLN) as 'Name', Authors.AuthAddress, Authors.AuthCity, Authors.AuthState, Authors.AuthContry, Authors.AuthZip
from Authors
;

/* 6.5. Find out author full name, book title and publisher name. */
select CONCAT(AuthFN, AuthMN, AuthLN) as 'Name', BookTitle, PubName
from AuthorBook as AB
    inner join Authors A on AB.AuthID = A.AuthID
    inner join Books B on AB.BookID = B.BookID
    inner join BookPublisher BP on AB.BookID = BP.BookID
    inner join Publishers P on BP.PubID = P.PubID
;


/* ************************************************************ */

