import java.util.stream.*;

class Solution {
    public int solution(int left, int right) {
        return IntStream.rangeClosed(left, right)
            .map(i -> getResult(i))
            .sum();
    }
    
    public int getResult(int target) {
        int count = 0;
        for (int i = 1; i <= target / 2; i++) {
            if (target % i == 0) {
                count++;
            }
        }
        
        count++; // 자기 자신 포함.
        
        return count % 2 == 0 ? target : (-1) * target;
    }
}