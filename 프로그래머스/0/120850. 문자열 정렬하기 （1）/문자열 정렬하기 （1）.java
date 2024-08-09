import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer;
        
        String str = my_string.replaceAll("[^0-9]", "");
        
        answer = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}