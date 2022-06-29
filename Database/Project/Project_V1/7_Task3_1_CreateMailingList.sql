/*
Database Group Project Version 1

Script Data : June 22, 2022
Developed by :  Jingyu An   2228416
                Hyunju Roh  2227572
*/


/*1. Create a mailing list of Library members that includes the members’ full names
    and complete address information.
 */


use WMlibrary
;
go

select M.memberID, concat(FirstName,' ',LastName ,' ', MiddleInitial) as 'Member Name' ,
       concat(A.street,' ' ,A.city ,' ' , a.state,' ' ,a.zip) as 'Member Address'
from Membership.Adults as A
    inner join Membership.Members M on A.MemberID = M.MemberID
    inner join Membership.Juvenile J on J.MemberIDP = M.MemberID
group by M.MemberID, FirstName, LastName, MiddleInitial, A.street, A.city, a.state, a.zip
;
go



