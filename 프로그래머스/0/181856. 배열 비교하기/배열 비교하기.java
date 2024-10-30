import java.util.stream.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr2.length != arr1.length) {
            if (arr2.length > arr1.length) {
                return -1;
            } else {
                return 1;
            }
        }
        
        int arr1_sum = IntStream.of(arr1).sum();
        int arr2_sum = IntStream.of(arr2).sum();

        return arr1_sum > arr2_sum ? 1 : (arr1_sum == arr2_sum ? 0 : -1);
    }
}