/*
Test 1

Script Data : June 17, 2022
Developed by :  Jingyu An // 2228416
*/

/*
4. First, they want to see which customers rented specific items.
For example, the kitchen chairs the FRI has been renting are of very poor quality and often break.
After complaints to the manufacturer, FRI has been able to replace all defective chairs.
*/

use FurnitureRental_JG
;

select L.ItemID, I.Description, L.Quantity, concat(C.FirstName , C.LastName) as 'Name', C.Email, C.Telephone
from RentalLineItem as L
    inner join Rentals R on L.RentalID = R.RentalID
    inner join Customers C on R.CustomerID = C.CustomerID
    inner join Inventory I on L.ItemID = I.ItemID
;