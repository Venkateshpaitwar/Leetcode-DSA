-- 577. Employee Bonus

select e.name, b.bonus from Employee e
left join bonus b
on e.empId = b.empId
where b.bonus is null OR b.bonus < 1000;