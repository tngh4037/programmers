import java.util.Arrays;

class Solution {
    public int solution(int n) {
        String[] strArr = (n + "").split("");
        
        return Arrays.stream(strArr)
            .mapToInt(Integer::parseInt)
            .sum();
    }
}