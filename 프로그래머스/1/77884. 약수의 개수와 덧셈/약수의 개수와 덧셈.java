import java.util.stream.IntStream;

class Solution {
    public int solution(int left, int right) {
        
        return IntStream.rangeClosed(left, right)
            .map(this::getResult)
            .sum();
    }
   
    private int getResult(int num) {
        int result = (int) IntStream.rangeClosed(1, num/2)
            .filter(i -> num % i == 0)
            .count();
        
        result++;
        
        return result % 2 == 0 ? num : -1 * num;
    }
}