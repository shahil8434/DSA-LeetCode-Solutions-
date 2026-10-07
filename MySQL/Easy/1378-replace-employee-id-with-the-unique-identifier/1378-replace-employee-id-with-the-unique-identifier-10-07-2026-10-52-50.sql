# Write your MySQL query statement below
SELECT unique_id, name
FROM Employees as E
LEFT JOIN EmployeeUNI as EU
ON EU.id = E.id;