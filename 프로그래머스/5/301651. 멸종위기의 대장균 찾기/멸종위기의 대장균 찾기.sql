-- 코드를 작성해주세요
WITH RECURSIVE GENERTATION_INFO AS (
    SELECT 1 AS GENERATION, ID
    FROM ECOLI_DATA 
    WHERE PARENT_ID IS NULL
    UNION ALL
    SELECT GENERATION + 1 AS GENERATION, A.ID
    FROM ECOLI_DATA A, GENERTATION_INFO B 
    WHERE A.PARENT_ID = B.ID
)
SELECT COUNT(*) AS COUNT, A.GENERATION
FROM GENERTATION_INFO A
     LEFT JOIN ECOLI_DATA B ON A.ID = B.PARENT_ID
WHERE B.PARENT_ID IS NULL
GROUP BY A.GENERATION
ORDER BY A.GENERATION