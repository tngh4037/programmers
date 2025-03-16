import java.util.stream.IntStream;

class Solution {
    public int solution(int left, int right) {

        return IntStream.rangeClosed(left, right)
            .map(i -> (IntStream.rangeClosed(1, i/2).filter(x -> i % x == 0).count() + 1) % 2 == 0 ? i : -i)
            .sum();
    }
    
}