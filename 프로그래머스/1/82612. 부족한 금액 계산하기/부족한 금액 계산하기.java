import java.util.stream.LongStream;

class Solution {
    public long solution(int price, int money, int count) {
        long sum = LongStream.rangeClosed(1, count)
            .map(i -> i * price)
            .sum();

        if (money >= sum) {
            return 0;
        }
        
        return sum - money;
    }
}
