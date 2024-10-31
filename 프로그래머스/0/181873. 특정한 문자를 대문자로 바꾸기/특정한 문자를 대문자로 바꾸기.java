import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, String alp) {
       
        return Arrays.stream(my_string.split(""))
            .map(s -> s.equals(alp) ? s.toUpperCase() : s)
            .collect(Collectors.joining());
    }
}