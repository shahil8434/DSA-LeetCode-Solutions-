# Write your MySQL query statement below
WITH SalaryCategories AS (
    SELECT 'Low Salary' AS category
    UNION ALL
    SELECT 'Average Salary'
    UNION ALL
    SELECT 'High Salary'
)
SELECT
    sc.category,
    COUNT(a.account_id) AS accounts_count
FROM SalaryCategories sc
LEFT JOIN Accounts a
    ON (sc.category = 'Low Salary' AND a.income < 20000)
    OR (sc.category = 'Average Salary' AND a.income BETWEEN 20000 AND 50000)
    OR (sc.category = 'High Salary' AND a.income > 50000)
GROUP BY sc.category;