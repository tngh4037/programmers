-- 코드를 작성해주세요
WITH RECURSIVE GENERATION_INFO AS (
    SELECT ID, 1 AS GENERATION
    FROM ECOLI_DATA 
    WHERE PARENT_ID IS NULL
    UNION
    SELECT A.ID, (B.GENERATION + 1) AS GENERATION
    FROM ECOLI_DATA A
         JOIN GENERATION_INFO B ON A.PARENT_ID = B.ID AND B.GENERATION < 3
)
SELECT ID
FROM GENERATION_INFO
WHERE GENERATION = 3
ORDER BY ID