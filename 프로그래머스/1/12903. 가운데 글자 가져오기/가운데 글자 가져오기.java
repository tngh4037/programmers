class Solution {
    public String solution(String s) {
        boolean isEven = (s.length() % 2 == 0);
        
        int num = s.length() / 2;
        if (isEven) {
            return String.valueOf(s.charAt(num-1)) + String.valueOf(s.charAt(num));
        } else {
            return String.valueOf(s.charAt(num));
        }
    }
}