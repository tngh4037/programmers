import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        return IntStream.of(arr)
            .filter(num1 -> !IntStream.of(delete_list).anyMatch(num2 -> num2 == num1))
            .toArray();
    }
}