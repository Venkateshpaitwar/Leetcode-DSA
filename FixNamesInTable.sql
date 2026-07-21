-- 1667. Fix Names in a Table

SELECT user_id, CONCAT((UPPER(LEFT(name, 1))), (LOWER(SUBSTRING(name, 2)))) AS name FROM users ORDER BY user_id