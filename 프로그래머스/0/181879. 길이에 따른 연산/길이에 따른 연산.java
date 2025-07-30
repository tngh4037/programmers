import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        if (num_list.length >= 11) {
            return Arrays.stream(num_list).sum();
        } else {
            return Arrays.stream(num_list).reduce((arr, i) -> arr * i).getAsInt();
        }
    }
}