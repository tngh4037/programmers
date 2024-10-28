import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(1, n)
            .filter(i -> n % i == 1)
            .findFirst().orElse(0);
    }
}