class Solution {
    boolean solution(String s) {
        int openCount = 0;
        
        for (char chr : s.toCharArray()) {
            if (chr == '(') {
                openCount++;
            } else {
                if (openCount == 0) {
                    return false;
                }
                
                openCount--;
            }
        }

        return openCount == 0;
    }
}