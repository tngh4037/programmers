-- 코드를 입력하세요
SELECT YEAR(SALES_DATE) AS 'YEAR', 
       MONTH(SALES_DATE) AS 'MONTH', 
       GENDER, 
       COUNT(DISTINCT A.USER_ID) AS 'USERS'
FROM USER_INFO A, ONLINE_SALE B
WHERE A.USER_ID = B.USER_ID
AND A.GENDER IS NOT NULL
GROUP BY YEAR(SALES_DATE), MONTH(SALES_DATE), GENDER
ORDER BY YEAR(SALES_DATE), MONTH(SALES_DATE), GENDER;


-- SELECT X.YEAR, X.MONTH, X.GENDER, COUNT(*) AS USERS
-- FROM ( 
--     SELECT A.USER_ID, YEAR(SALES_DATE) AS 'YEAR', MONTH(SALES_DATE) AS 'MONTH', A.GENDER
--     FROM USER_INFO A, ONLINE_SALE B
--     WHERE A.USER_ID = B.USER_ID
--     AND A.GENDER IS NOT NULL
--     GROUP BY A.USER_ID, YEAR, MONTH, GENDER 
-- ) X
-- GROUP BY X.YEAR, X.MONTH, X.GENDER
-- ORDER BY X.YEAR, X.MONTH, X.GENDER