import java.util.*;

public class Solution {
    public int solution(int n) {
        String str = String.valueOf(n);

        return Arrays.stream(str.split(""))
            .mapToInt(Integer::parseInt)
            .sum();
    }
}