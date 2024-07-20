import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length < 2) {
            return new int[]{-1};
        }
        
        List<Integer> nums = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (min > nums.get(i)) {
                min = nums.get(i);
            }
        }
        
        for (int i = 0; i < nums.size(); i++) {
            if (min == nums.get(i)) {
                nums.remove(i);
                break;
            }
        }
        
        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
}