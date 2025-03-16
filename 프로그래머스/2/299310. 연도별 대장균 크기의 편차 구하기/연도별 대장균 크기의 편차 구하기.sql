-- 코드를 작성해주세요
WITH STATIC_ECOLI_DATA AS (
    SELECT YEAR(DIFFERENTIATION_DATE) AS YEAR, MAX(SIZE_OF_COLONY) AS SIZE_OF_COLONY
    FROM ECOLI_DATA 
    GROUP BY YEAR(DIFFERENTIATION_DATE)
)
SELECT  YEAR(DIFFERENTIATION_DATE) AS YEAR, 
        ((SELECT SIZE_OF_COLONY 
         FROM STATIC_ECOLI_DATA 
         WHERE YEAR = YEAR(A.DIFFERENTIATION_DATE)) - SIZE_OF_COLONY) AS YEAR_DEV,
        ID
FROM ECOLI_DATA A
ORDER BY YEAR, YEAR_DEV

