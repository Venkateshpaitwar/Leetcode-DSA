-- 596. Classes With at Least 5 Students

select class from Courses
group by class 
having count(*) > 4