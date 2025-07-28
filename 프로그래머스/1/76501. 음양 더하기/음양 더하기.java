import java.util.stream.IntStream;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        
        return IntStream.range(0, absolutes.length)
            .map(i -> (signs[i] ? 1 : -1) * absolutes[i])
            .sum();
    }
}