import java.util.stream.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        
        return IntStream.range(0, my_string.length())
            .filter(i -> my_string.substring(i).equals(is_suffix))
            .findFirst()
            .orElse(-1) >= 0 ? 1 : 0;
    }
}