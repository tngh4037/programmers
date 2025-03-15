-- 코드를 작성해주세요
SELECT A.ITEM_ID, A.ITEM_NAME, A.RARITY
FROM ITEM_INFO A, (
    SELECT Y.ITEM_ID
    FROM ITEM_INFO X, ITEM_TREE Y
    WHERE X.ITEM_ID = Y.PARENT_ITEM_ID
    AND X.RARITY = 'RARE'
) B
WHERE A.ITEM_ID = B.ITEM_ID
ORDER BY A.ITEM_ID DESC