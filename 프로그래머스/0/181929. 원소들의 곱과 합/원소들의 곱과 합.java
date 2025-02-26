import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int multiply = 1;
        for (int num : num_list) {
            multiply = num * multiply;
        }
        
        int sum = Arrays.stream(num_list).sum();
        
        return (multiply > (sum * sum)) ? 0 : 1;
    }
}