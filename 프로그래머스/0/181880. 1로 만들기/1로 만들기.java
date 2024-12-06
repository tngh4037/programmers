import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        
        return Arrays.stream(num_list)
            .map(num -> calculate(num))
            .sum();
    }
    
    private int calculate(int num) {
        int count = 0;
        
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num - 1) / 2;
            }
            
            count++;
        }
        
        return count;
    }
}