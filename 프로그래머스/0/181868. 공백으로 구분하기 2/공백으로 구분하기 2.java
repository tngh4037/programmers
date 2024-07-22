import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        return Arrays.stream(my_string.split(" "))
            .map(v -> v.trim())
            .filter(v -> !v.isEmpty())
            .toArray(String[]::new);
    }
}