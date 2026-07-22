-- 177. Nth Highest Salary

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
    SELECT salary FROM (
        SELECT salary, DENSE_RANK() OVER(ORDER BY salary DESC) AS RN
        FROM Employee
    )
    AS ranked 
    WHERE RN = n
    LIMIT 1
  );
END