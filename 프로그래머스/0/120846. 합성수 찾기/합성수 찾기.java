import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        
        return (int) IntStream.rangeClosed(1, n)
            .filter(this::isTargetNumber)
            .count();
    }
    
    private boolean isTargetNumber(int num) {
        int count = (int) IntStream.rangeClosed(1, num/2)
            .filter(i -> num % i == 0)
            .count();
        
        return (count+1) >= 3;
    }
}