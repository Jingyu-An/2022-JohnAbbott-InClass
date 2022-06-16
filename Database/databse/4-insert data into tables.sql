/* Purpose: Apply data integrity to tables in Flix database */

/* Script Date: June 13, 2022
   Developed by: Jingyu An
*/

-- switch to Flix database
-- Syntax: use database_name;
use jgflix2022
;


/* Data Integrity Types:
• Domain (Column)
• Entity (Row)
• Referential (between two tables or two columns within the smae table

Constraint Types:
1) Primary Key --> pk_table_name	(pk_Customers)

2) Foreign Key -->
	2a. between two tables
			constraint_name constraint_type
		fk_table_name1_table_name2 foreign key (fk_column) references table_name (pk_column)

    2b. between two columns within the same table
		fk_table_name_column_name1_column_name2	(fk_Employees_EmpployeeID_ReportsTo)

3) Unique --> uq_column_name_table_name	(uq_CompanyName_Contacts) - apply to non-primary-key column

4) Default --> df_column_name_table_name (df_City_Suppliers)

5) Check -->
		5a.	ck_column_name_table_name (ck_Quantity_OrderDetails (Quantity condition) )

        5b. ck_column_name1_column_name2_table_name ck_DateDue_dateOut_Transactions (DateDue >= DateOut)
*/

-- adding a primary key for an exisiting table
create table Contacts
(
	ContactID int not null,
    FirstName varchar(15) not null,
    LastName varchar(15) not null
)
;

-- add a primary key to table Contacts
alter table Contacts
	-- constraint constraint_name constraint_type
		add constraint pk_Contacts primary key (ContactID asc)
;

INSERT INTO Roles ( RoleID, RoleDescrip)
VALUES
('r101', 'Actor'),
('r102', 'Director'),
('r103', 'Producer'),
('r104', 'Executive Producer'),
('r105', 'Co-Producer'),
('r106', 'Assistant Producer'),
('r107', 'Screenwriter'),
('r108', 'Composer'),
('r109', 'Line producer'),
('r110', 'Unit manager'),
('r111', 'Production coordinator'),
('r112', 'First assistant director'),
('r113', 'Second assistant director'),
('r114', 'Other assistant directors'),
('r115', 'Production accountant'),
('r116', 'Location manager'),
('r117', 'Assistant location manager'),
('r118', 'Legal counsel'),
('r119', 'Script supervisor'),
('r120', 'Casting director')
;

select *
from roles
;

/* Inserts into the MovieTypes table */
INSERT INTO MovieTypes (MTypeID, MTypeDescrip)
VALUES
('mt01', 'Action'),
('mt02', 'Adventure'),
('mt03', 'Comedy'),
('mt04', 'Crime'),
('mt05', 'Drama'),
('mt06', 'Fantasy'),
('mt07', 'Historical'),
('mt08', 'Historical fiction'),
('mt09', 'Horror'),
('mt10', 'Magical realism'),
('mt11', 'Mystery'),
('mt12', 'Paranoid fiction'),
('mt13', 'Philosophical'),
('mt14', 'Political'),
('mt15', 'Romance'),
('mt16', 'Saga'),
('mt17', 'Satire'),
('mt18', 'Science fiction'),
('mt19', 'Social'),
('mt20', 'Speculative'),
('mt21', 'Thriller'),
('mt22', 'Urban'),
('mt23', 'Western'),
('mt24', 'Animation'),
('mt25', 'Musical')
;

select *
from movietypes
;

/* Inserts into the Studios table */
INSERT INTO Studios
VALUES
('s101', 'Universal Pictures'),
('s102', 'Paramount Pictures'),
('s103', 'Warner Bros.'),
('s104', 'Walt Disney Pictures'),
('s105', 'Columbia Pictures'),
('s106', 'Metro-Goldwyn-Mayer Pictures'),
('s107', 'Sony Pictures Motion Picture Group'),
('s108', '20th Century Fox'),
('s109', 'Lionsgate Films'),
('s110', 'DreamWorks Pictures'),
('s111', 'The Weinstein Company'),
('s112', 'Netflix Production'),
('s113', 'Illumination'),
('s114', 'New Line Cinema'),
('s115', 'HBO Films'),
('s116', 'TriStar Pictures'),
('s117', 'Pixar Animation Studios'),
('s118', 'ABC'),
('s119', 'Blue Sky Studios')
;

select *
from studios
;

/* Inserts into the Ratings table */
INSERT INTO Ratings (RatingID, RatingDescrip)
VALUES
('NR', 'Not rated'),
('G', 'General audiences'),
('PG', 'Parental guidance suggested'),
('PG13', 'Parents strongly cautioned'),
('R', 'Under 17 requires adult'),
('X', 'No one 17 and under')
;

select *
from Ratings
;


/* Inserts into the Formats table */
INSERT INTO Formats (FormID, FormDescrip)
VALUES
('f1', 'Widescreen'),
('f2', 'Fullscreen'),
('f3', 'Digital HD'),
('f4', 'Blu-ray')
;

select *
from Formats
;

/* Inserts into the Status table */
INSERT INTO Status (StatID , StatDescrip)
VALUES
('s1', 'Checked out'),
('s2', 'Available'),
('s3', 'Damaged'),
('s4', 'Lost')
;

select *
from Status
;


/* Inserts into the Particpants table */
INSERT INTO Participants (PartFN, PartMN, PartLN)
VALUES
('Sydney', 'M.', 'Pollack'),
('Robert', NULL, 'Redford'),
('Meryl', NULL, 'Streep'),
('John', NULL, 'Barry'),
('Henry', NULL, 'Buck'),
('Humphrey', NULL, 'Bogart'),
('Danny', NULL, 'Kaye'),
('Rosemary', NULL, 'Clooney'),
('Irving', NULL, 'Berlin'),
('Michael', NULL, 'Curtiz'),
('Bing', NULL, 'Crosby');

select *
from Participants
;

alter table employees
    modify EmpMN varchar(20) null
;

/* Inserts into the Employees table */

INSERT INTO Employees (EmpFN, EmpMN, EmpLN)
VALUES
('John', 'P.', 'Smith'),
('Robert', NULL, 'Schroader'),
('Mary', 'Marie', 'Michaels'),
('John', NULL, 'Laguci'),
('Rita', 'C.', 'Carter'),
('George', NULL, 'Brooks')
;

select *
from Employees
;


/* Inserts into the Customers table */
INSERT INTO Customers (CustFN, CustMN, CustLN)
VALUES
('Ralph', 'Frederick', 'Johnson'),
('Hubert', 'T.', 'Weatherby'),
('Anne', NULL, 'Thomas'),
('Mona', 'J.', 'Cavenaugh'),
('Peter', NULL, 'Taylor'),
('Ginger', 'Meagan', 'Delaney')
;

select *
from Customers
;


/* Inserts into the DVDs table */
INSERT INTO DVDs (DVDName, NumDisks, YearRlsd, MTypeID, StudID, RatingID, FormID, StatID)
VALUES
('White Christmas', 1, '2000', 'mt16', 's105', 'NR', 'f1', 's1'),
('What''s Up, Doc?', 1, '2001', 'mt12', 's103', 'G', 'f1', 's2'),
('Out of Africa', 1, '2000', 'mt11', 's101', 'PG', 'f1', 's1'),
('The Maltese Falcon', 1, '2000', 'mt11', 's103', 'NR', 'f1', 's2'),
('Amadeus', 1, '1997', 'mt11', 's103', 'PG', 'f1', 's2'),
('The Rocky Horror Picture Show', 2, '2000', 'mt12', 's106', 'NR', 'f1', 's2'),
('A Room with a View', 1, '2000', 'mt11', 's107', 'NR', 'f1', 's1'),
('Mash', 2, '2001', 'mt12', 's106', 'R', 'f1', 's2'),
('Can You Keep a Secret?', 1, '2019', 'mt03', 's107','G', 'f1', 's2'),
('Toy Story 4', 1, '2019', 'mt24', 's117', 'PG', 'f2', 's2'),
('Spider-Man: Far from Home',1, '2019', 'mt18', 's105', 'PG13', 'f1', 's2'),
('The Lighthouse',1, '2019', 'mt09', 's105', 'PG13', 'f3', 's2'),
('Paradise Hills ',1, '2019', 'mt06', 's105', 'PG13', 'f4', 's2')
;

select *
from dvds
;

/* **********************************************************
in case you want to reset the auto_increment value, you need to
1. delete all data from the table, for exaqmple
select *
from dvds
;

delete
from DVDs
;

2. then, alter the table and reset the auto_increment to 1
alter table DVDs
	auto_increment = 1
;

************************************************************ */

/* Inserts into the DVDParticipants table */
INSERT INTO DVDParticipants( DVDID, PartID, RoleID)
VALUES
(3, 1, 'r102'),
(3, 4, 'r108'),
(3, 1, 'r103'),
(3, 2, 'r101'),
(3, 3, 'r101'),
(4, 6, 'r101'),
(1, 8, 'r101'),
(1, 9, 'r108'),
(1, 10, 'r102'),
(1, 11, 'r101'),
(1, 7, 'r101'),
(2, 5, 'r107');


select *
from DVDParticipants
;

/* Inserts into the Orders table */
INSERT INTO Orders (CustID, EmpID)
VALUES
(1, 3),
(1, 2),
(2, 5),
(3, 6),
(4, 1),
(3, 3),
(5, 2),
(6, 4),
(4, 5),
(6, 2),
(3, 1),
(1, 6),
(5, 4);

select *
from Orders
;

/*
delete
from Transactions
;

alter table Transactions
	auto_increment = 1
;
*/
/* Inserts into the Transactions table */
alter table transactions
    modify DateIn date null
;

INSERT INTO Transactions (OrderID, DVDID, DateOut, DateDue)
VALUES
(1, 1, CURDATE(), adddate(current_date(), interval 3 day)),
(1, 4, current_date(), adddate(current_date(), interval 3 day)),
(1, 8, CURDATE(), adddate(current_date(), interval 3 day)),
(2, 3, CURDATE(), adddate(current_date(), interval 3 day)),
(3, 4, CURDATE(), adddate(current_date(), interval 3 day)),
(3, 1, CURDATE(), adddate(current_date(), interval 3 day)),
(3, 7, CURDATE(), adddate(current_date(), interval 3 day)),
(4, 4, CURDATE(), adddate(current_date(), interval 3 day)),
(5, 3, CURDATE(), adddate(current_date(), interval 3 day)),
(6, 2, CURDATE(), adddate(current_date(), interval 3 day)),
(6, 1, CURDATE(), adddate(current_date(), interval 3 day)),
(7, 4, CURDATE(), adddate(current_date(), interval 3 day)),
(8, 2, CURDATE(), adddate(current_date(), interval 3 day)),
(8, 1, CURDATE(), adddate(current_date(), interval 3 day)),
(8, 3, CURDATE(), adddate(current_date(), interval 3 day)),
(9, 7, CURDATE(), adddate(current_date(), interval 3 day)),
(9, 1, CURDATE(), adddate(current_date(), interval 3 day)),
(10, 5, CURDATE(), adddate(current_date(), interval 3 day)),
(11, 6, CURDATE(), adddate(current_date(), interval 3 day)),
(11, 2, CURDATE(), adddate(current_date(), interval 3 day)),
(11, 8, CURDATE(), adddate(current_date(), interval 3 day)),
(12, 5, CURDATE(), adddate(current_date(), interval 3 day)),
(13, 7, CURDATE(), adddate(current_date(), interval 3 day))
;

select *
from Transactions
;