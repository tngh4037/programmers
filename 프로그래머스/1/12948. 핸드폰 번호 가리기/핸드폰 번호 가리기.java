import java.util.*;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String[] numbers = phone_number.split("");
        for(int i = 0; i < numbers.length; i++) {
            if (i >= numbers.length - 4) {
                answer += numbers[i];
            } else {
                answer += "*";
            }
        }

        return answer;
    }
}