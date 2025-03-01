-- 코드를 작성해주세요
SELECT A.DEPT_ID, A.DEPT_NAME_EN, ROUND(AVG(B.SAL), 0) AS AVG_SAL
FROM HR_DEPARTMENT A, HR_EMPLOYEES B
WHERE A.DEPT_ID = B.DEPT_ID
GROUP BY A.DEPT_ID, A.DEPT_NAME_EN
ORDER BY AVG_SAL DESC