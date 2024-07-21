class Solution {
    public String solution(String s) {
        String answer = "";
        
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            if (str == ' ') {
                answer += String.valueOf(str);
                num = 0;
            } else {
                if (num % 2 == 0) {
                    answer += String.valueOf(str).toUpperCase();
                } else {
                    answer += String.valueOf(str).toLowerCase();
                }
                num++;
            }
        }
        
        return answer;
    }
}