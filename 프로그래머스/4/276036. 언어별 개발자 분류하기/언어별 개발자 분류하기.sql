-- 코드를 작성해주세요
SELECT X.GRADE, X.ID, X.EMAIL
FROM (
    SELECT 
        CASE 
            WHEN 
                SKILL_CODE & (SELECT SUM(CODE) FROM SKILLCODES WHERE (CATEGORY = 'Front End')) != 0 
                &&
                SKILL_CODE & (SELECT SUM(CODE) FROM SKILLCODES WHERE (NAME = 'Python')) != 0
            THEN 'A'
            WHEN SKILL_CODE & (SELECT SUM(CODE) FROM SKILLCODES WHERE (NAME = 'C#')) != 0 THEN 'B'
            WHEN SKILL_CODE & (SELECT SUM(CODE) FROM SKILLCODES WHERE (CATEGORY = 'Front End')) != 0 THEN 'C'
            ELSE ''
        END AS GRADE,
            ID,
            EMAIL
    FROM DEVELOPERS
) X
WHERE X.GRADE != ''
ORDER BY X.GRADE, X.ID;