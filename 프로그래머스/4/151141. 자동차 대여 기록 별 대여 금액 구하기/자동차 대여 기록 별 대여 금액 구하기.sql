-- 코드를 입력하세요


SELECT B.HISTORY_ID,
       CASE 
            WHEN DATEDIFF(END_DATE, START_DATE)+1 >= 90 
                THEN FLOOR((A.DAILY_FEE - (A.DAILY_FEE * (SELECT ROUND(DISCOUNT_RATE / 100, 2) 
                                                    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                                                    WHERE DURATION_TYPE = '90일 이상'
                                                    AND CAR_TYPE = '트럭'))) * (DATEDIFF(END_DATE, START_DATE) + 1))
            WHEN DATEDIFF(END_DATE, START_DATE)+1 >= 30 
                THEN FLOOR((A.DAILY_FEE - (A.DAILY_FEE * (SELECT ROUND(DISCOUNT_RATE / 100, 2) 
                                                    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                                                    WHERE DURATION_TYPE = '30일 이상'
                                                    AND CAR_TYPE = '트럭'))) * (DATEDIFF(END_DATE, START_DATE) + 1))
            WHEN DATEDIFF(END_DATE, START_DATE)+1 >= 7 
                THEN FLOOR((A.DAILY_FEE - (A.DAILY_FEE * (SELECT ROUND(DISCOUNT_RATE / 100, 2) 
                                                    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                                                    WHERE DURATION_TYPE = '7일 이상'
                                                    AND CAR_TYPE = '트럭'))) * (DATEDIFF(END_DATE, START_DATE) + 1))
            ELSE FLOOR(A.DAILY_FEE * (DATEDIFF(END_DATE, START_DATE)+1))
       END AS FEE
FROM CAR_RENTAL_COMPANY_CAR A, CAR_RENTAL_COMPANY_RENTAL_HISTORY B
WHERE A.CAR_ID = B.CAR_ID
AND A.CAR_TYPE = '트럭'
ORDER BY 2 DESC, 1 DESC;
    




-- 자동차 종류가 '트럭'인 자동차의 대여 기록에 대해서
-- 대여 기록 별로 대여 금액(컬럼명: FEE)을 구하여
-- 기록 ID와 대여 금액 리스트를 출력하는 SQL문