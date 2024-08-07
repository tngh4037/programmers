class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String num = "";
        for (char spel: my_string.toCharArray()) {
            int code = (int) spel;
            if (code >= 48 && code <= 57) {
                num += spel;
            } else {
                if (!num.isEmpty()) {
                    answer += Integer.parseInt(num);
                }
                
                num = "";
            }
        }
        
        if (!num.isEmpty()) {
            answer += Integer.parseInt(num);
        }
        
        return answer;
    }
}