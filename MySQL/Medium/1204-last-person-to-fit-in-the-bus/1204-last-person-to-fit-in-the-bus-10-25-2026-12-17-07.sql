# Write your MySQL query statement below
SELECT person_name
FROM (SELECT person_name, SUM(weight) OVER (ORDER BY turn ASC) as run FROM Queue) as q
WHERE run <= 1000
ORDER BY run DESC
LIMIT 1;    