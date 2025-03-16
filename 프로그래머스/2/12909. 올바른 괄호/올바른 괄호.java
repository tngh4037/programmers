class Solution {
    boolean solution(String s) {
        int openCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            if (str == '(') {
                openCount++;
            }
            
            if (str == ')') {
                if (openCount == 0) {
                    return false;
                }
                
                openCount--;
            }
        }
        
        return openCount == 0;
    }
}