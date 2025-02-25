-- 코드를 입력하세요
SELECT B.BOOK_ID, A.AUTHOR_NAME, DATE_FORMAT(B.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM AUTHOR A, BOOK B
WHERE A.AUTHOR_ID = B.AUTHOR_ID
AND B.CATEGORY = '경제'
ORDER BY B.PUBLISHED_DATE 