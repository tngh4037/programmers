import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        return Arrays.stream(arr)
            .filter(num -> !Arrays.stream(delete_list).anyMatch(e -> num == e))
            .toArray();
    }
}