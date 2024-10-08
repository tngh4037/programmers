-- 코드를 작성해주세요
SELECT X.ID, X.GENOTYPE, X.PARENT_GENOTYPE
FROM (
    SELECT  A.ID, 
            A.GENOTYPE, 
            (SELECT GENOTYPE 
             FROM ECOLI_DATA 
             WHERE ID = A.PARENT_ID
             AND GENOTYPE & A.GENOTYPE = GENOTYPE) AS PARENT_GENOTYPE
    FROM ECOLI_DATA A
) X
WHERE X.PARENT_GENOTYPE IS NOT NULL
ORDER BY X.ID;

-- SELECT A.ID, A.GENOTYPE, B.GENOTYPE AS PARENT_GENOTYPE
-- FROM ECOLI_DATA A, ECOLI_DATA B
-- WHERE A.PARENT_ID = B.ID
-- AND B.GENOTYPE & A.GENOTYPE = B.GENOTYPE
-- ORDER BY ID