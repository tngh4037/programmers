-- 코드를 입력하세요
SELECT DISTINCT(A.CAR_ID)
FROM CAR_RENTAL_COMPANY_CAR A, CAR_RENTAL_COMPANY_RENTAL_HISTORY B
WHERE A.CAR_ID = B.CAR_ID
AND B.START_DATE LIKE '%-10-%'
AND A.CAR_TYPE = '세단'
ORDER BY A.CAR_ID DESC;