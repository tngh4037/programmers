import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> nums = new ArrayList<>();
        for (int[] interval: intervals) {
            int a = interval[0];
            int b = interval[1];
            
            for (int i = 0; i < arr.length; i++) {
                if (i >= a && i <= b) {
                    nums.add(arr[i]);
                }
            }
        }
        
        return nums.stream().mapToInt(x -> x).toArray();
    }
}