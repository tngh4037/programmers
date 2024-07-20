class Solution {
    public boolean solution(String s) {
        
        if (s.length() != 4 && s.length() != 6) {
             return false;
        }

        for (char chr: s.toCharArray()) {
            int code = (int) chr;
            if (!(code >= 48 && code <= 57)) {
                return false;
            }
        }
        
        return true;
    }
}