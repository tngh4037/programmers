import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        
        return Arrays.stream(my_string.replaceAll("[a-z|A-Z]", "").split(""))
            .mapToInt(Integer::parseInt)
            .sum();
    }
}