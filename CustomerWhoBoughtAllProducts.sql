-- 1045. Customers Who Bought All Products

select customer_id from Customer group by customer_id having COUNT(distinct product_key ) = (select count(*) from Product);  