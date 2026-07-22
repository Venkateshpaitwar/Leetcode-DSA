-- 185. Department Top Three Salaries

# Write your MySQL query statement below
SELECT
    d.name AS Department,
    r.name AS Employee,
    r.salary AS Salary
FROM (
    SELECT
        name,
        salary,
        departmentId,
        DENSE_RANK() OVER(
            PARTITION BY departmentId
            ORDER BY salary DESC
        ) AS rn
    FROM Employee
) r
JOIN Department d
ON r.departmentId = d.id
WHERE rn <= 3;