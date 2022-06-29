/*
Test 1

Script Data : June 17, 2022
Developed by :  Jingyu An // 2228416
*/

-- 3. First, they want to be able to record a rental order complete with details of what customers rented.

use FurnitureRental_JG
;

select R.CustomerID, concat(C.FirstName , C.LastName) as 'Name', L.RentalID, L.ItemID, R.DateRented, R.DateRented
from RentalLineItem as L
    inner join Rentals R on L.RentalID = R.RentalID
    inner join Customers C on R.CustomerID = C.CustomerID
;
