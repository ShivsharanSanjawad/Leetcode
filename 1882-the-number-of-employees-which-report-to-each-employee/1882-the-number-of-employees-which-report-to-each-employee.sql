# Write your MySQL query statement below
SELECT X.EMPLOYEE_ID as employee_id , X.NAME as name ,COUNT(Y.AGE) as reports_count , ROUND(AVG(Y.AGE)) AS average_age FROM Employees AS X,Employees AS Y 
WHERE X.EMPLOYEE_ID = Y.REPORTS_TO GROUP BY EMPLOYEE_ID order by x.employee_id