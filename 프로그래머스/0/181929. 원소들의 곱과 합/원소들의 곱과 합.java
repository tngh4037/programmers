import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int sumAll = Arrays.stream(num_list).sum();
        
        int multiplyAll = Arrays.stream(num_list)
            .reduce(1, (before, after) -> before * after);
        
        return multiplyAll < Math.pow(sumAll, 2) ? 1 : 0;
    }
}