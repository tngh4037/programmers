import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        if (arr1Length != arr2Length) {
            if (arr1Length > arr2Length) {
                return 1;
            } else {
                return -1;
            }
        } else {
            int arr1Sum = Arrays.stream(arr1).sum();
            int arr2Sum = Arrays.stream(arr2).sum();
            if (arr1Sum > arr2Sum) {
                return 1;
            } else if (arr1Sum < arr2Sum) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}