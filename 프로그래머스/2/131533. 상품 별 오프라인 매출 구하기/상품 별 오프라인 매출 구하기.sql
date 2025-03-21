-- 코드를 입력하세요
SELECT A.PRODUCT_CODE, A.PRICE * SUM(B.SALES_AMOUNT) AS SALES
FROM PRODUCT A, OFFLINE_SALE B
WHERE A.PRODUCT_ID = B.PRODUCT_ID
GROUP BY A.PRODUCT_CODE
ORDER BY SALES DESC, A.PRODUCT_CODE