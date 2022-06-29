/*
Test 1

Script Data : June 17, 2022
Developed by :  Jingyu An // 2228416
*/

-- 2. List items that are rent for less than $10/month.

use FurnitureRental_JG
;

select *
from Inventory
where PricePerMonth < 10
;