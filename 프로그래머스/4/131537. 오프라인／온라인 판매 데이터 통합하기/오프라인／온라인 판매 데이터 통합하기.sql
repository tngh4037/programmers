-- 코드를 입력하세요
SELECT DATE_FORMAT(A.SALES_DATE, '%Y-%m-%d') AS SALES_DATE, A.PRODUCT_ID, A.USER_ID, A.SALES_AMOUNT
FROM (
    SELECT SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
    FROM ONLINE_SALE 
    WHERE SALES_DATE >= '2022-03-01 00:00:00' AND SALES_DATE < '2022-04-01 00:00:00'
    UNION ALL
    SELECT SALES_DATE, PRODUCT_ID, NULL, SALES_AMOUNT
    FROM OFFLINE_SALE
    WHERE SALES_DATE >= '2022-03-01 00:00:00' AND SALES_DATE < '2022-04-01 00:00:00'
) A
ORDER BY A.SALES_DATE, A.PRODUCT_ID, A.USER_ID;
