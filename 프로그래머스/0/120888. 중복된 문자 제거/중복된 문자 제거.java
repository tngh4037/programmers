import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] strArr = Arrays.stream(my_string.split("")).distinct().toArray(String[]::new);

        return String.join("", strArr);
    }
}