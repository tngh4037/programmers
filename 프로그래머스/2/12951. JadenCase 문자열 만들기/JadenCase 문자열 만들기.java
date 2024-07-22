class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArr = s.split("");
        boolean isFirst = true;
        for (String str: strArr) {
            if (str.equals(" ")) {
                answer += str;
                isFirst = true;
                continue;
            }
            
            if (isFirst) {
                int code = (int) str.charAt(0);
                if (code >= 48 && code <= 57) { // 0 ~ 9
                    answer += str;
                } else {
                    answer += str.toUpperCase();
                }
                
                isFirst = false;
            } else {
                answer += str.toLowerCase();
            }
        }
        
        return answer;
    }
}