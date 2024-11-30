import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int evenCount = (int) Arrays.stream(num_list)
            .filter(num -> num % 2 == 0)
            .count();
        
        int oddCount = (int) Arrays.stream(num_list)
            .filter(num -> num % 2 != 0)
            .count();
        
        return new int[]{evenCount, oddCount};
    }
}