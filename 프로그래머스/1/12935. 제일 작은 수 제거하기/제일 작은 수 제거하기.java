import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        int minValue = IntStream.of(arr).min().orElseThrow(() -> new IllegalArgumentException());
        
        int[] answer = Arrays.stream(arr)
            .filter(num -> num != minValue)
            .toArray();
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}