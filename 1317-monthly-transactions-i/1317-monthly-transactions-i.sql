# Write your MySQL query statement below
SELECT DATE_FORMAT(TRANS_DATE , '%Y-%m') AS month,country ,
     COUNT(ID) AS trans_count ,
     COUNT(CASE WHEN STATE='approved' THEN 1 END) AS approved_count ,
     SUM(AMOUNT) AS trans_total_amount ,
     SUM(CASE WHEN STATE ='approved' THEN AMOUNT ELSE 0 END  ) AS approved_total_amount 
        FROM Transactions WHERE TRANS_DATE IS NOT NULL GROUP BY COUNTRY , DATE_FORMAT(TRANS_DATE,'%Y-%m')  ;
