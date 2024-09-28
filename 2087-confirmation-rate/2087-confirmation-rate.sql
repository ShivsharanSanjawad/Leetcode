# Write your MySQL query statement below
SELECT S.USER_ID,
       ROUND(COUNT(CASE WHEN C.ACTION = 'confirmed' THEN 1 END) / COUNT(S.USER_ID),2) AS confirmation_rate
FROM Signups AS S
LEFT JOIN Confirmations AS C ON S.USER_ID = C.USER_ID
GROUP BY S.USER_ID;
