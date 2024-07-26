import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        return k % 2 == 0 ? 
            IntStream.of(arr).map(v -> v + k).toArray() : 
            IntStream.of(arr).map(v -> v * k).toArray();
    }
}