/*
Test 1

Script Data : June 17, 2022
Developed by :  Jingyu An // 2228416
*/

/*
7. The company would like a report that calculates
and then shows all the rental money billed to the student for the fall semester.
*/

use FurnitureRental_JG
;

select concat(C.FirstName , C.LastName) as 'Name', I.ItemID, I.Description, R.DateRented, R.DateReturned, SUM(TIMESTAMPDIFF(MONTH, R.DateRented, R.DateReturned) * I.PricePerMonth) as 'all the rental money'
from RentalLineItem as L
    inner join Rentals R on L.RentalID = R.RentalID
    inner join Customers C on R.CustomerID = C.CustomerID
    inner join Inventory I on L.ItemID = I.ItemID
group by c.CustomerID
;