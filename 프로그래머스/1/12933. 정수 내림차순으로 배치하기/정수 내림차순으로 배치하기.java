import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

class Solution {
    public long solution(long n) {

        String answer = Arrays.stream(String.valueOf(n).split(""))
            .sorted(Collections.reverseOrder())
            .collect(Collectors.joining());
        
        return Long.parseLong(answer);
    }
}