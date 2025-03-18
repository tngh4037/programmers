class Solution {
    public int[] solution(String s) {
        int loopCount = 0;
        int removeCount = 0;

        String newStr = s;
        while (!newStr.equals("1")) {
            int beforeLength = newStr.length();
            newStr = newStr.replace("0", "");
            int afterLength = newStr.length();
            
            newStr = Integer.toString(afterLength, 2);
            
            loopCount++;
            removeCount = removeCount + (beforeLength - afterLength);
        }
        
        return new int[]{loopCount, removeCount};
    }
}