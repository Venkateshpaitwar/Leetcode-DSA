-- 570. Managers with at Least 5 Direct Reports

# Write your MySQL query statement below
select e.name as name from employee e
join employee as e2
on e.id = e2.managerid
group by e.name, e.id
having count(e2.managerid) >= 5