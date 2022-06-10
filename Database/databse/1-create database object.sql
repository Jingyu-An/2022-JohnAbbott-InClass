/*
Purpose : To create a database that tracks the inveltory
of DVDs, probvides information about the DVDs,
records rental transactions, and stores the names of
the store's customers and employees.
*/

/*
Script Data : June 10, 2022
Developed by : Jingyu An
*/

/*
Partial Syntax:
CREATE DATABASE [IF NOT EXISTS] <database name>
[[DEFAULT] CHARACTER SET <character set name>]
[[DEFAULT] COLLATE <collation name>]
*/


-- CREATE object_type object_name
create database JGFlix2022
;

-- switch to Flix database
-- Syntax : use database_name;
use JGFlix2022
;

/*
using the schema command to create a new database in MySQL.
Note. Creating schema in Microsoft SQL Server has different meaning.
*/

-- create schema schema_name
create schema myDB
;

-- create a database with charset and collate
create database BookStore
default character set latin1
default collate latin1_bin
;

-- show the character set and collation in MySQL
show character set
;

show collation
;

/*
remove (drop) a database from MySQL server
*/
-- drop object_type object_name

drop database myDB
;

drop schema BookStore
;