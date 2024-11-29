-- 코드를 작성해주세요
-- 사번, 성명, 평가 등급, 성과금을 조회
WITH SCORE_INFO AS (
    SELECT EMP_NO, (SUM(SCORE) / 2) AS BASE_SCORE
    FROM HR_GRADE
    GROUP BY EMP_NO
)
SELECT  A.EMP_NO, A.EMP_NAME, 
        CASE
            WHEN B.BASE_SCORE >= 96 THEN 'S'
            WHEN B.BASE_SCORE >= 90 THEN 'A'
            WHEN B.BASE_SCORE >= 80 THEN 'B'
            ELSE 'C'
        END AS GRADE,
        CASE
            WHEN B.BASE_SCORE >= 96 THEN SAL * 0.2
            WHEN B.BASE_SCORE >= 90 THEN SAL * 0.15
            WHEN B.BASE_SCORE >= 80 THEN SAL * 0.1
            ELSE 0
        END AS BONUS
FROM HR_EMPLOYEES A, SCORE_INFO B
WHERE A.EMP_NO = B.EMP_NO
ORDER BY A.EMP_NO