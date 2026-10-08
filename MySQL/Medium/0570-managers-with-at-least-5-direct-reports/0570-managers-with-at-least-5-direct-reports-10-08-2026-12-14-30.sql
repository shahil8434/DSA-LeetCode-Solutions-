# Write your MySQL query statement below
SELECT a.name as name
FROM Employee as a
JOIN Employee as b
ON a.id = b.managerId
GROUP BY a.name, a.id
HAVING count(b.managerid) >= 5;