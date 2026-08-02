-- 1527. Patients With a Condition

select * from Patients where conditions like 'DIAB1%' or conditions like '% DIAB1%';