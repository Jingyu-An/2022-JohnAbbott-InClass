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

/* modify in a table
1. change the column name
2. change the data type
3. change the column size
4. change nullubility (null or not null
5. add a new column
6. drop an existing column
7. add constraint(s)
*/

-- add a new column, City, to the Contacts table
/*ALTER TABLE table
ADD [COLUMN] column_name column_definition [FIRST|AFTER existing_column]
;
*/

alter table Contacts
	add column City varchar(15) not null
;

/* create a default constraint on the City column in Contacts table,
when a table is already exists */
alter table Contacts
		alter column City
        set default 'Montreal'
;

describe Contacts
;


/* *************************************************************** */
/* add froeign key constraint(s) to the DVDs table */

/* Syntax: add constraint contraint_name contraint_type (fk_column)
	refrences pk_table_name (pk_column) */

/* 1. Foreign Key Between DVDs and MovieTypes tables */
alter table DVDs
	add constraint fk_DVDs_MovieTypes foreign key (MTypeID)
		references MovieTypes (MTypeID)
;

/* 2) Foreign Key Between DVDs and Studios tables */
alter table DVDs
	add constraint fk_DVDs_Studios foreign key (StudID)
		references Studios (StudID)
;

/* 3) Between DVDs and Ratings tables */
alter table DVDs
	add constraint fk_DVDs_Ratings foreign key (RatingID)
		references Ratings (RatingID)
;

/* 4) Between DVDs and Formats tables */
alter table DVDs
	add constraint fk_DVDs_Formats foreign key (FormID)
		references Formats (FormID)
;

/* 5) Between DVDs and Status tables */
alter table DVDs
	add constraint fk_DVDs_Status foreign key (StatID)
		references Status (StatID)
;

/* *************************************************************** */
/* add foreign key constraint(s) to the table DVDParticipants */

/* 1) Between DVDParticipants and DVDs tables */
alter table DVDParticipants
	add constraint fk_DVDParticipants_DVDs foreign key (DVDID)
		references DVDS (DVDID)
;

/* 2) Between DVDParticipants and Participants tables */
alter table DVDParticipants
	add constraint fk_DVDParticipants_Participants foreign key (PartID)
		references Participants (PartID)
;

/* 3) Between DVDParticipants and Roles tables */
alter table DVDParticipants
	add constraint fk_DVDParticipants_Roles foreign key (RoleID)
		references Roles (RoleID)
;

/* *************************************************************** */
-- add foreign key constraints to the table Orders

/* 1) Between Orders and Customers tables */
alter table Orders
	add constraint fk_Orders_Customers foreign key (CustID)
		references Customers (CustID)
;

/* 2) Between Orders and Employees tables */
alter table Orders
	add constraint fk_Orders_Employees foreign key (EmpID)
		references Employees (EmpID)
;

/* *************************************************************** */
-- add foreign key constraints to the table Transactions

/* 1) Between Transactions and Orders tables */
alter table Transactions
	add constraint fk_Transactions_Orders foreign key (OrderID)
		references Orders (OrderID)
;

/* 2) Between Transactions and DVDs tables */
alter table Transactions
	add constraint fk_Transactions_DVDs foreign key (DVDID)
		references DVDs (DVDID)
;

/* *************************************************************** */

-- set the DVD Name to unique constraint
alter table DVDs
	-- uq_column_name_table_name
    add constraint uq_DVDName_DVDs unique (DVDName)
;

/* return the DVDs table definition */
describe DVDs
;

show columns from DVDs
;

/* *************************************************************** */
/* set the default value of the NumDisks column in the table DVDs to One */
alter table DVDs
	alter column NumDisks
    set default 1
;


/* *************************************************************** */
/* set a check constraint to the Transactions table
on Date Due to be greater than or equal to Date Out */
alter table Transactions
	add constraint ck_DateDue_DateOut_Transctions check (DateDue >= DateOut)
;

show columns from Transactions
;

describe transactions
;

show create table transactions
;

select *
from information_schema.COLUMNS
where table_name = 'Transactions'
;
