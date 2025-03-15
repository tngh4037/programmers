class Solution {
    public String solution(String s) {
        int index = s.length() / 2;
        
        if (s.length() % 2 == 0) {
            return String.valueOf(s.charAt(index-1)) + String.valueOf(s.charAt(index));
        } else {
            return String.valueOf(s.charAt(index));
        }
    }
}