/*
Assignment
SA5_DB_Take_Home_Assignment_2_Data_Winter_2022_FSD-05

Script Data : June 14, 2022
Developed by :  Jingyu An   2228416
                Hyunju Roh  2227572
*/

# 18. Darnell sometimes needs to contact the warehouse managers, accountants, administrative assistants,
#     and other employees at the warehouse where they work.
#     Create a contact list that he can use to phone employees,
#         and that contains enough information to identity employees, their positions,
#         and their warehouses along with the warehouse phone number.
#         Because Darnell might eventually use this list as the basis for a report,
#             the employee’s name should appear as one full name, with the last name first.
#             When you show this query to Darnell, he realizes that it would be more helpful
#                 if he could specify a particular warehouse before producing the list,
#                 and then see the contact information only for the employees who work in that warehouse.
#         Create a script that meets these needs,
#     saving it as 11_EmployeeContactByWarehouse.

use MovingOn_JGAnAndHJRoh
;

select concat(E.EmpFirst ,' ', E.EmpLast) as 'Employee Name', P.Title as 'Job Title', W.State, W.Phone
from Employees as E
    inner join Positions P on E.PositionID = P.PositionID
    inner join Warehouses W on E.WarehouseID = W.WarehouseID
;
