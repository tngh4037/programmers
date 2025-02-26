import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] num_list) {
        int oddSum = Integer.parseInt(Arrays.stream(num_list)
            .filter(num -> num % 2 != 0)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining()));
        
        int evenSum = Integer.parseInt(Arrays.stream(num_list)
            .filter(num -> num % 2 == 0)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining()));
        
        return oddSum + evenSum;
    }
}