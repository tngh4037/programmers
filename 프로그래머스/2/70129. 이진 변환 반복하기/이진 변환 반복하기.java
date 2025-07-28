class Solution {
    public int[] solution(String s) {
        int operatorCount = 0;
        int removeCount = 0;
        while (!s.equals("1")) {
            operatorCount++;
            
            String temp = s.replace("0", "");
            removeCount = removeCount + (s.length() - temp.length());
            
            s = Integer.toString(temp.length(), 2);
        }
        
        return new int[]{operatorCount, removeCount};
    }
}