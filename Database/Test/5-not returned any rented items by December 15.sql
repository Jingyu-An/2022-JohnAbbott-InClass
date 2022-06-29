/*
Test 1

Script Data : June 17, 2022
Developed by :  Jingyu An // 2228416
*/

/*
5. The company wants to be able to send reminders to students who have not returned any rented items by December 15.
This reminder is sent to make sure that students remember to return all rental items,
even if they are graduating mid-year or simply moving on at the end of the fall semester.
*/

use FurnitureRental_JG
;

select concat(C.FirstName , C.LastName) as 'Name', C.Email, C.Telephone, R.DateRented, R.DateReturned
from Rentals as R
    inner join Customers C on R.CustomerID = C.CustomerID
where R.DateReturned is NULL or TIMESTAMPDIFF(DAY ,'2021-12-15', R.DateReturned) > 0
;