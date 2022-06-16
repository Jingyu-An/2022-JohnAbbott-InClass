/* Purpose: Creating table objects in Flix database */

/* Script Date: June 10, 2022
   Developed by: Jingyu An
*/

-- switch to Flix database
-- Syntax: use database_name;
use jgflix2022
;

/* create table object - Partial syntax:
		create table table_name
		(
			column_name data_type constraint(s),
   			column_name data_type constraint(s),
			...
			column_name data_type constraint(s),

		)

    where constraint defines the business rules: not not, null,
    primary key (pk_), default (df_), check (ck_), unique (uq_), foreign key (fk_)
*/


/* character data type:
char(length) - fixed length
varchar(length) - variable length
*/

/* *****	Table No. 1 - Customers 	***** */
create table Customers
(
	CustID smallint auto_increment not null primary key,
    CustFN varchar(20) not null,
    CustMN varchar(20) null,
    CustLN varchar(20) not null
)
;

-- return the definition of the table Customers
show columns
from Customers
;

-- or using describe comman
describe Customers
;

/* creating the lookup tables */
/* *****	Table No. 2 - Roles 	***** */
create table Roles
(
	RoleID varchar(4) not null,
    RoleDescrip varchar(30) not null,
    -- constraint constraint_name constraint_type
    constraint pk_Roles primary key (RoleID asc)
)
;

describe Roles
;

/* *****	Table No. 3 -  MovieTypes	***** */
create table MovieTypes
(
    MTypeID varchar(4) not null ,
    MTypeDescrip varchar(30) not null ,
    constraint pk_MovieTypes primary key ( MTypeID asc )
)
;
/* *****	Table No. 4 -  	Studios ***** */
create table Studios
(
    StudID varchar(4) not null ,
    StudDescrip varchar(40) not null ,
    constraint pk_Studios primary key (StudID asc )
)
;

/* *****	Table No. 5 -  	 Ratings ***** */
create table Ratings
(
    RatingID varchar(4) not null ,
    RatingDescrip varchar(30) not null ,
    constraint pk_Ratings primary key (RatingID asc )
)
;

/* *****	Table No. 6 - Formats 	 ***** */
create table Formats
(
    FormID char(2) not null ,
    FormDescrip varchar(15) not null ,
    constraint pk_Formats primary key (FormID asc )
)
;

/* *****	Table No. 7 -  	Status ***** */
create table Status
(
    StatID char(3) not null ,
    StatDescrip varchar(20) not null ,
    constraint pk_Status primary key (StatID asc )
)
;

/* *****	Table No. 8 - Participants 	 ***** */
create table Participants
(
    PartID smallint auto_increment not null primary key ,
    PartFN varchar(20) not null ,
    PartMN varchar(20) null ,
    PartLN varchar(20) not null
)
;


/* *****	Table No. 9 - DVDs 	 ***** */
create table DVDs
(
    DVDID    smallint   auto_increment not null primary key,
    DVDName  varchar(60) not null,
    NumDisks tinyint     not null,
    YearRlsd year        not null,
    MTypeID  varchar(4)  not null, -- foreign key references to MovieTypes table
    StudID   varchar(4)  not null, -- foreign key references to Studios table
    RatingID varchar(4)  not null, -- foreign key references to Ratings table
    FormID   char(2)     not null, -- foreign key references to Formats table
    StatID   char(3)     not null -- foreign key references to Status table
)
;

/* *****	Table No. 10 -  DVDParticipants	 ***** */
create table DVDParticipants
(
	DVDID smallint not null,	-- foreign key references to DVDs table
    PartID smallint not null,	-- foreign key references to Participants table
    RoleID varchar(4) not null,	 -- foreign key references to Roles table
    constraint pk_DVDParticipants primary key
		(
			DVDID asc,
            PartID asc,
            RoleID asc
		)
)
;

describe DVDParticipants
;

/* *****	Table No. 11 - Employees  ***** */
create table Employees
(
    EmpID smallint auto_increment not null primary key,
    EmpFN varchar(20) not null ,
    EmpMN varchar(20) not null ,
    EmpLN varchar(20) not null
)
;

/* *****	Table No. 12 - Orders 	 ***** */
create table Orders
(
    OrderID int auto_increment not null primary key,
    CustID smallint not null , -- foreign key references to Customers table
    EmpID smallint not null   -- foreign key references to Employees table
)
;

/* *****	Table No. 13 - Transactions 	 ***** */
create table Transactions
(
    TransID int auto_increment not null primary key,
    OrderID int not null ,    -- foreign key references to Orders table
    DVDID smallint not null , -- foreign key references to DVDs table
    DateOut date not null ,
    DateDue date not null ,
    DateIn date not null
)
;