import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        
        return IntStream.range(0, parts.length)
            .mapToObj(i -> my_strings[i].substring(parts[i][0], parts[i][1]+1))
            .collect(Collectors.joining());
    }
}