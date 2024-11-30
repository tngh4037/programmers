-- 코드를 작성해주세요
WITH PARENT_EXIST_ITEMS AS (
    SELECT DISTINCT(A.ITEM_ID) AS ITEM_ID
    FROM ITEM_INFO A, ITEM_TREE B
    WHERE A.ITEM_ID = B.PARENT_ITEM_ID
)
SELECT ITEM_ID, ITEM_NAME, RARITY
FROM ITEM_INFO
WHERE ITEM_ID NOT IN (
    SELECT ITEM_ID
    FROM PARENT_EXIST_ITEMS
)
ORDER BY ITEM_ID DESC