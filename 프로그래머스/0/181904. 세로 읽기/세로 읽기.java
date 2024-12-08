import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int m, int c) {
        int rowCount = my_string.length() / m;
 
        return IntStream.range(0, rowCount)
            .mapToObj(i -> my_string.substring(i*m, (i+1)*m).substring(c-1, c))
            .collect(Collectors.joining());
    }
}