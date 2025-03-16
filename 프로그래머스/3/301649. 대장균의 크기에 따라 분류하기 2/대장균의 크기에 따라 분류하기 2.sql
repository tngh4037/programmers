-- 코드를 작성해주세요
WITH RATE_INFO AS (
    SELECT ID, ((rank() over(order by SIZE_OF_COLONY desc)) / COUNT(*) OVER()) AS RATE
    FROM ECOLI_DATA 
)
SELECT  ID, 
        CASE 
            WHEN RATE <= 0.25 THEN 'CRITICAL'
            WHEN RATE <= 0.50 THEN 'HIGH'
            WHEN RATE <= 0.75 THEN 'MEDIUM'
            ELSE 'LOW'
        END AS 'COLONY_NAME'
FROM RATE_INFO
ORDER BY ID