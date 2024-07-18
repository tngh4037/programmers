class Solution {
    boolean solution(String s) {
        String str = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;
        
        for (char chr: str.toCharArray()) {
            if (String.valueOf(chr).equals("y")) {
                yCount++;
            }
            if (String.valueOf(chr).equals("p")) {
                pCount++;
            }
        }
        
        if (yCount == 0 && pCount == 0) {
            return true;
        }
        
        return yCount == pCount;
    }
}