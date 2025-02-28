-- 코드를 작성해주세요
SELECT COUNT(*) AS FISH_COUNT, B.FISH_NAME
FROM FISH_INFO A, FISH_NAME_INFO B
WHERE A.FISH_TYPE = B.FISH_TYPE
GROUP BY B.FISH_NAME
ORDER BY FISH_COUNT DESC