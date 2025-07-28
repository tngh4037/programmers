import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String my_string) {
        
        return my_string.chars()
            .filter(c -> c >= '0' && c <= '9')
            .map(i -> i - '0')
            .sorted()
            .toArray();
    }
}