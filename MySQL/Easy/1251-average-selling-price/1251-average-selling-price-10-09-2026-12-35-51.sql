# Write your MySQL query statement below
SELECT p.product_id, IFNULL(ROUND(SUM(p.price * u.units) / SUM(u.units),2), 0)
 as average_price
FROM Prices as p
LEFT JOIN UnitsSold as u
ON p.product_id = u.product_id
WHERE
p.start_date <= u.purchase_date 
AND p.end_date >= u.purchase_date
OR u.purchase_date IS NULL
GROUP BY  p.product_id
 