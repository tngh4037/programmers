class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        int s_start = (int) 'a'; // 97
        int s_end = (int) 'z'; // 122
        int b_start = (int) 'A'; // 65
        int b_end = (int) 'Z'; // 97
        
        char[] charArr = s.toCharArray();
        for (char str: charArr) {
            if (str == ' ') {
                answer += " ";
            } else {
                int code = (int) str;
                if (code >= s_start && code <= s_end) {
                    for (int i = 0; i < n; i++) {
                        if (code == s_end) {
                            code = s_start - 1;
                        }
                        code = code + 1;
                    }
                } else {
                    for (int i = 0; i < n; i++) {
                        if (code == b_end) {
                            code = b_start - 1;
                        }
                        code = code + 1;
                    }
                }

                answer += String.valueOf((char) code);
            }
        } 

        return answer;
    }
}