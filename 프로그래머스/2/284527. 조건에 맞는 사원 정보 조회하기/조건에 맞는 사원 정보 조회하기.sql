-- 코드를 작성해주세요
SELECT C.SCORE, B.EMP_NO, B.EMP_NAME, B.POSITION, B.EMAIL
FROM HR_DEPARTMENT A, HR_EMPLOYEES B, 
     ( SELECT YEAR, EMP_NO, SUM(SCORE) AS SCORE  
       FROM HR_GRADE 
       WHERE YEAR = 2022
       GROUP BY YEAR, EMP_NO ) AS C
WHERE A.DEPT_ID	= B.DEPT_ID	
AND B.EMP_NO = C.EMP_NO
ORDER BY C.SCORE DESC 
LIMIT 0, 1;