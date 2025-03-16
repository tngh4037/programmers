-- 코드를 작성해주세요
WITH FIRST_GENERATION AS (
    SELECT 1 AS GENERATION, ID
    FROM ECOLI_DATA 
    WHERE PARENT_ID IS NULL
),
SECOND_GENERATION AS (
    SELECT 2 AS GENERATION, ID
    FROM ECOLI_DATA
    WHERE PARENT_ID IN (
        SELECT ID
        FROM FIRST_GENERATION
    )
)
SELECT ID
FROM ECOLI_DATA
WHERE PARENT_ID IN (
    SELECT ID
    FROM SECOND_GENERATION
)
ORDER BY ID