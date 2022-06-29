/*
Test 1

Script Data : June 17, 2022
Developed by :  Jingyu An // 2228416
*/

/* *************************************************************** */
/* create database */
create database FurnitureRental_JG
;

use FurnitureRental_JG
;

/* *************************************************************** */
/* Create Tables */
-- 1. Customers
create table Customers
(
    CustomerID INT not null ,
    LastName varchar(25) not null ,
    FirstName varchar(25) not null ,
    Address varchar(30) not null ,
    City varchar(15) not null ,
    State CHAR(2) not null ,
    Zip CHAR(5) not null ,
    Telephone varchar(15) not null ,
    Email varchar(25) not null ,
    constraint pk_Customers primary key (CustomerID asc)
)
;

-- 2. Inventory
create table Inventory
(
    ItemID CHAR(5)  not null ,
    Description varchar(25) not null ,
    PricePerMonth DECIMAL(5,2)  not null ,
    constraint pk_Inventory primary key (ItemID asc)
)
;

-- 3. Rentals
create table Rentals
(
    RentalID SMALLINT not null ,
    CustomerID INT not null ,                           -- foreign key references to Customers
    DateRented DATETIME not null ,
    DateReturned DATETIME not null ,
    constraint pk_Rentals primary key (RentalID asc)
)
;

-- 4. RentalLineItem
create table RentalLineItem
(
    RentalID SMALLINT not null ,                        -- foreign key references to Rentals
    ItemID CHAR(5) not null ,                           -- foreign key references to Inventory
    Quantity SMALLINT not null
)
;

/* *************************************************************** */
/* add foreign key constraint(s) to the Rentals */
/* Foreign Key Between Rentals and Customers tables */
alter table Rentals
	add constraint fk_Rentals_Customers foreign key (CustomerID)
		references Customers (CustomerID)
;

/* *************************************************************** */
/* add foreign key constraint(s) to the RentalLineItem */
/* Foreign Key Between RentalLineItem and Rentals tables */
alter table RentalLineItem
	add constraint fk_RentalLineItem_Rentals foreign key (RentalID)
		references Rentals (RentalID)
;

/* Foreign Key Between RentalLineItem and Inventory tables */
alter table RentalLineItem
	add constraint fk_RentalLineItem_Inventory foreign key (ItemID)
		references Inventory (ItemID)
;

/* Add data from txt files */
load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Customers.txt'
into table Customers
fields terminated by ','
lines terminated by '\r\n'
;

load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Inventory.txt'
into table Inventory
fields terminated by ','
lines terminated by '\r\n'
;


load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Rentals.txt'
into table Rentals
fields terminated by ','
lines terminated by '\r\n'
;

load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/RentalLineItem.txt'
into table RentalLineItem
fields terminated by ','
lines terminated by '\r\n'
;
