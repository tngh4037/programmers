import java.util.*;

class Solution {
    public int solution(String my_string) {
        String str = my_string.replaceAll("[a-z|A-Z]", "");

        return Arrays.stream(str.split("")).mapToInt(Integer::parseInt).sum();
    }
}