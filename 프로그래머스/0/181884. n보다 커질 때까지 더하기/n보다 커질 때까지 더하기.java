import java.util.Arrays;

class Solution {
    public int solution(int[] numbers, int n) {
        
        return Arrays.stream(numbers)
            .reduce(0, (s1, s2) -> {
                if (s1 > n) {
                    return s1;
                }
                
                return s1 + s2;
            });
    }
}