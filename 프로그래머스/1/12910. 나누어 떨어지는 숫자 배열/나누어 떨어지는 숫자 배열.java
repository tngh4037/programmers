import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        arr = IntStream.of(arr)
            .filter(num -> num % divisor == 0)
            .sorted()
            .toArray();
        
        return arr.length == 0 ? new int[]{-1} : arr;
    }
}