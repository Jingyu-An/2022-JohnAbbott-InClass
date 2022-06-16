/*
Assignment
SA5_DB_Take_Home_Assignment_2_Data_Winter_2022_FSD-05

Script Data : June 14, 2022
Developed by :  Jingyu An   2228416
                Hyunju Roh  2227572
*/

use MovingOn_JGAnAndHJRoh
;

# /* 1. return the DVD name and Movie Type Description */
# select
# 	D.DVDName as 'DVD Name', MT.MTypeDescrip as 'Movie Type'
# from DVDs as D inner join MovieTypes as MT
# 	on D.MTypeID = MT.MTypeID
# ;

select  P.Title as 'Job Title', count(E.PositionID) as 'Number of employees'
    from Employees as E inner join Positions P on E.PositionID = P.PositionID
    group by E.PositionID
;
