import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        
        String[] answer = Arrays.stream(myStr.split("[a|b|c]"))
            .filter(str -> !str.isBlank())
            .toArray(String[]::new);
       
        return answer.length < 1 ? new String[]{"EMPTY"} : answer;
    }
}