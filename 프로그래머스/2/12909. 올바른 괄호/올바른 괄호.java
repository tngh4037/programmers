class Solution {
    boolean solution(String s) {
        int openCount = 0;
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i+1);
            if (str.equals("(")) {
                openCount++;
            }
            
            if (str.equals(")")) {
                if (openCount < 1) {
                    return false;
                }
                
                openCount--;
            }
        }

        return openCount == 0;
    }
}