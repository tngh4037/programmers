import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(long n) {
        return Arrays.stream(new StringBuilder(String.valueOf(n)).reverse().toString().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
    }
}