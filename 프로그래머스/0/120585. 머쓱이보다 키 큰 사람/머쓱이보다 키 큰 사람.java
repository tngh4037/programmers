import java.util.stream.*;

class Solution {
    public int solution(int[] array, int height) {
        return (int) IntStream.of(array)
            .filter(v -> v > height)
            .count();
    }
}