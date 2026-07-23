-- 1683. Invalid Tweets

# Write your MySQL query statement below
SELECT tweet_id FROM Tweets WHERE LENGTH(content) > 15;