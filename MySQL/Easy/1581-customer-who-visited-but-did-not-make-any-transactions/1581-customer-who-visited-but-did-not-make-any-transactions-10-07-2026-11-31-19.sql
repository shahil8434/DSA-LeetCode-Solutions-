# Write your MySQL query statement below
SELECT V.customer_id, COUNT(V.Visit_id) as count_no_trans
FROM Visits as V
LEFT JOIN Transactions as T
ON V.Visit_id = T.Visit_id
WHERE T.amount is NULL
GROUP BY V.customer_id;