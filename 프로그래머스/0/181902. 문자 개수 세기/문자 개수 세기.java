import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (char temp: my_string.toCharArray()) {
            int code = (int) temp;
            
            if ((code >= 65 && code <= 90)) {
                answer[code - 65] += 1;
            }
            
            // 97 - ? = 26
            if ((code >= 97 && code <= 122)) {
                answer[code - 71] += 1;
            }
            
        }
        
        return answer;
    }
}