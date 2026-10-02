-- 1251. Average Selling Price
select p.product_id, 
ROUND(
    COALESCE(SUM(u.units * price) / SUM(u.units),0),
    2
) as average_price
FROM Prices as p
LEFT JOIN UnitsSold as u
on u.product_id = p.product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
group by p.product_id 
