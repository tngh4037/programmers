import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        return Arrays.stream(my_string.split(""))
            .filter(s -> {
                int code = s.charAt(0);
                return code >= '0' && code <= '9';
            })
            .mapToInt(Integer::parseInt)
            .sum();
    }
}