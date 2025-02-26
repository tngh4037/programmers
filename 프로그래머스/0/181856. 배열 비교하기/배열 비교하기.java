import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arr1_length = arr1.length;
        int arr2_length = arr2.length;
        if (arr1_length != arr2_length) {
            return arr1_length > arr2_length ? 1 : -1;
        } 
      
        int arr1_sum = Arrays.stream(arr1).sum();
        int arr2_sum = Arrays.stream(arr2).sum();
        if (arr1_sum == arr2_sum) {
            return 0;
        }
        
        return arr1_sum > arr2_sum ? 1 : -1;
    }
}