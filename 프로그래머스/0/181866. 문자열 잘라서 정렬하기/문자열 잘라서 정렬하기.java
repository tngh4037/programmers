import java.util.Arrays;
import java.util.function.Predicate;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
            .filter(Predicate.not(String::isBlank))
            .sorted()
            .toArray(String[]::new);
    }
}