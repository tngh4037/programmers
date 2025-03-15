import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        int minValue = Arrays.stream(arr).min().orElse(-1);
        
        int[] answer = Arrays.stream(arr).filter(i -> i != minValue).toArray();
  
        return answer.length < 1 ? new int[]{-1} : answer;
    }
}