import java.util.Arrays;
import java.util.function.Predicate;

class Solution {
    public String[] solution(String[] strArr) {
      
        return Arrays.stream(strArr)
            .filter(Predicate.not(s -> s.contains("ad")))
            .toArray(String[]::new);
    }
}