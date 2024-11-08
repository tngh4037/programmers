import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int k) {

        return k % 2 == 0 ? 
            IntStream.of(arr).map(i -> i + k).toArray() : 
            IntStream.of(arr).map(i -> i * k).toArray();
    }
}