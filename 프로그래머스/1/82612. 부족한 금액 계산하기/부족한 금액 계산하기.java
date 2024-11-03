import java.util.stream.*;

class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice = LongStream.rangeClosed(1, count)
            .map(i -> price * i)
            .sum();

        long payAmt = totalPrice - money; 

        return payAmt > 0 ? payAmt : 0;
    }
    
}