import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int sum = (int) Math.pow(Arrays.stream(num_list).sum(), 2);
        int multiply = Arrays.stream(num_list).reduce((acc, i) -> acc * i).getAsInt();
        
        return multiply < sum ? 1 : 0;
    }
}