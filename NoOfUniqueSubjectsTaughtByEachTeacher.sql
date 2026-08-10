-- 2356. Number of Unique Subjects Taught by Each Teacher

select teacher_id, COUNT(DISTINCT subject_id) as cnt FROM teacher GROUP BY teacher_id;