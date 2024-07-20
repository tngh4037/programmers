import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] first = Arrays.stream(num_list)
            .skip(n)
            .toArray();
        
        int[] last = Arrays.stream(num_list)
            .limit(n)
            .toArray();
        
        return IntStream.concat(Arrays.stream(first), Arrays.stream(last)).toArray();
    }
}