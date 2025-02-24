import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String target1 = String.valueOf(my_string.charAt(num1));
        String target2 = String.valueOf(my_string.charAt(num2));

        return IntStream.range(0, my_string.length())
            .mapToObj(i -> i == num1 ? target2 : (i == num2 ? target1 : String.valueOf(my_string.charAt(i))))
            .collect(Collectors.joining());
    }
}