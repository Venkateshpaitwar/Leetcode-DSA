-- 619. Biggest Single Number

# Write your MySQL query statement below
SELECT ifnull(num, 'null') as num
FROM MyNumbers
GROUP BY num
HAVING COUNT(num) = 1
ORDER BY num DESC
LIMIT 1