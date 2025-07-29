import java.util.stream.IntStream;

class Solution {
    public long solution(int price, int money, int count) {

        long totalPrice = 0;
        for (int i = 1; i <= count; i++) {
            totalPrice = totalPrice + (i * price);
        }
        
        long needMoney = totalPrice - money;
      
        return needMoney > 0 ? needMoney : 0;
    }
}
