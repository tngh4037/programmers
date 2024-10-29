import java.util.Arrays;

class Solution {
    public boolean solution(int x) {
        String strX = String.valueOf(x);
        int sum = Arrays.stream(strX.split(""))
            .mapToInt(Integer::parseInt)
            .sum();

        return x % sum == 0;
    }
}