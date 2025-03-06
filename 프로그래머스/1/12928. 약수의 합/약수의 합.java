import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        
        return n + IntStream.rangeClosed(1, n/2)
            .filter(i -> n % i == 0)
            .sum();
    }
}