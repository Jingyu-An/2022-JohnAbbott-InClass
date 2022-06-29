/*
Test 1

Script Data : June 17, 2022
Developed by :  Jingyu An // 2228416
*/

/*
6. Of course, the company needs to keep track of the most popular furniture for rental
so it can plan future marketing promotion and warehouse stocking.*/

use FurnitureRental_JG
;

select I.ItemID, I.Description, count(I.ItemID) as 'popularity'
from RentalLineItem as L
    inner join Inventory I on L.ItemID = I.ItemID
group by I.ItemID
order by popularity desc
limit 1
;

