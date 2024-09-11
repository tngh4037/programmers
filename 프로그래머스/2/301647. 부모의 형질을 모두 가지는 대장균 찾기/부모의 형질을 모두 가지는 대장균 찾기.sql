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