-- 코드를 입력하세요
SELECT B.ANIMAL_ID, B.ANIMAL_TYPE, B.NAME
FROM ANIMAL_INS A, ANIMAL_OUTS B
WHERE A.ANIMAL_ID = B.ANIMAL_ID
AND (A.SEX_UPON_INTAKE LIKE '%Intact%' AND 
        (
            B.SEX_UPON_OUTCOME LIKE '%Spayed%' 
            OR 
            B.SEX_UPON_OUTCOME LIKE '%Neutered%'
        )
     )
ORDER BY B.ANIMAL_ID;