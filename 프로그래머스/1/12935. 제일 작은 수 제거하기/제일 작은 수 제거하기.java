import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int minValue = Arrays.stream(arr).min().orElseThrow(() -> new IllegalArgumentException());
        
        int[] answer = Arrays.stream(arr).filter(num -> num != minValue).toArray();
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}