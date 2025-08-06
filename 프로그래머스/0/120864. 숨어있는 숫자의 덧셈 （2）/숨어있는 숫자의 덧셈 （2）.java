import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
       
        return Arrays.stream(my_string.split("[a-z|A-Z]"))
            .filter(str -> !str.isBlank())
            .mapToInt(Integer::parseInt)
            .sum();
    }
}