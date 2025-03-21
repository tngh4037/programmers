-- 코드를 작성해주세요
WITH FRONT_END_CODE AS (
    SELECT SUM(CODE) AS CODE
    FROM SKILLCODES 
    WHERE CATEGORY = 'Front End'
)
SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS  
WHERE SKILL_CODE & (SELECT CODE FROM FRONT_END_CODE) > 0
ORDER BY ID