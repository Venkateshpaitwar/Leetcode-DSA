-- 1934. Confirmation Rate

select s.user_id,
    ROUND(
        AVG(CASE WHEN action = 'confirmed' THEN 1 ELSE 0 END),
        2
    ) as confirmation_rate 
FROM signups s 
LEFT JOIN Confirmations c
    on s.user_id = c.user_id
GROUP BY s.user_id