# Write your MySQL query statement below
SELECT user_id, COUNT(DISTINCT f.follower_id) as followers_count
FROM Followers as f
GROUP BY user_id;