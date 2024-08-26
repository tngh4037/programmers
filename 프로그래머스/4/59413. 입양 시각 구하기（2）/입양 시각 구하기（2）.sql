-- 코드를 입력하세요
WITH RECURSIVE HOURS 
AS ( 
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR + 1
    FROM HOURS
    WHERE HOUR < 23 
)
SELECT A.HOUR, IFNULL(B.COUNT, 0) AS COUNT
FROM HOURS A 
     LEFT JOIN ( SELECT HOUR(DATETIME) AS HOUR, COUNT(*) AS COUNT
                 FROM ANIMAL_OUTS
                 GROUP BY HOUR(DATETIME) ) B ON A.HOUR = B.HOUR
ORDER BY A.HOUR;