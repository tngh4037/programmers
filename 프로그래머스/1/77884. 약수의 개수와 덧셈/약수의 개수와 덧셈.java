import java.util.stream.*;

class Solution {
    public int solution(int left, int right) {

        return IntStream.rangeClosed(left, right)
            .map(i -> i % Math.sqrt(i) == 0 ? (-1) * i : i)
            .sum();
    }
}