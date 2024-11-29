import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int n) {

        return Arrays.stream(my_string.split(""))
            .map(s -> s.repeat(n))
            .collect(Collectors.joining());
    }
}