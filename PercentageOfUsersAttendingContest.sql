--1633. Percentage of Users Attended a Contest

select contest_id, 
ROUND(
    COUNT(r.user_id) * 100 / (SELECT COUNT(*) FROM Users),
    2  
)as percentage
from Register r 
LEFT JOIN Users u
ON u.user_id = r.user_id
GROUP BY r.contest_id
ORDER BY percentage DESC, r.contest_id ASC