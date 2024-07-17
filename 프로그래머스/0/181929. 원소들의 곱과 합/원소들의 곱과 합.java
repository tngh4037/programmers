import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int multiSum = 1;
        int sum = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            multiSum = multiSum * num_list[i];
            sum = sum + num_list[i];
        }
        
        return multiSum < (sum * sum) ? 1 : 0;
    }
}