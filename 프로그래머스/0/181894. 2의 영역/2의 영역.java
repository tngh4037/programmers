import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int totalCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                totalCount++;
            }
        }
        
        if (totalCount < 1) {
            return new int[]{-1};
        }
        
        List<Integer> nums = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count++;
            }
            
            if (count > 0) {
                nums.add(arr[i]);
            }
            
            if (count == totalCount) {
                break;
            }
        }
        
        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
}