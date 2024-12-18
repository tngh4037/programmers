-- 코드를 입력하세요
SELECT A.CATEGORY, SUM(B.SALES) AS TOTAL_SALES
FROM BOOK A, BOOK_SALES B
WHERE A.BOOK_ID = B.BOOK_ID
AND B.SALES_DATE >= '2022-01-01 00:00:00' AND B.SALES_DATE < '2022-02-01 00:00:00'
GROUP BY A.CATEGORY
ORDER BY A.CATEGORY