import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = IntStream.range(0, my_string.length())
            .mapToObj(i -> my_string.substring(i))
            .toArray(String[]::new);
        
        Arrays.sort(answer);
            
        return answer;
    }
}