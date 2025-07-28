import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        
        return my_string.chars()
            .mapToObj(c -> c >= 'a' && c <= 'z' ? 
                      String.valueOf((char) c).toUpperCase() : 
                      String.valueOf((char) c).toLowerCase())
            .collect(Collectors.joining());
    }
}