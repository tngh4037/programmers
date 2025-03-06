import java.util.Arrays;

public class Solution {
    public int solution(int n) {
        String strN = "" + n;

        return Arrays.stream(strN.split(""))
            .mapToInt(Integer::parseInt)
            .sum();
    }
}