-- 1378. Replace Employee ID With The Unique Identifier

select e1.unique_id, e.name from Employees e
LEFT JOIN EmployeeUNI e1
ON e.id = e1.id