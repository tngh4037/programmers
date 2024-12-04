import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[] indices) {
        String[] splitArr = my_string.split("");
        
        Arrays.stream(indices)
            .forEach(i -> splitArr[i] = "0");

        return Arrays.stream(splitArr)
            .filter(s -> !s.equals("0"))
            .collect(Collectors.joining());
    }
}