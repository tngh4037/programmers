-- 코드를 입력하세요
SELECT FLAVOR
FROM (
    SELECT FLAVOR, TOTAL_ORDER
    FROM FIRST_HALF 
    UNION ALL
    SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOTAL_ORDER
    FROM JULY 
    GROUP BY FLAVOR
) A
GROUP BY FLAVOR
ORDER BY SUM(TOTAL_ORDER) DESC
LIMIT 0, 3
