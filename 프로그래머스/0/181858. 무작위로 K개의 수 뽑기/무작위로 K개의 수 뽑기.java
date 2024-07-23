import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int num: arr) {
            if (nums.size() >= k) {
                break;
            }
            
            if (nums.contains(num)) {
                continue;
            }
            
            nums.add(num);
        }
        
        if (nums.size() < k) {
            int diffNum = k - nums.size();
            for (int i = 0; i < diffNum; i++) {
                nums.add(-1);
            }
        }
        
        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
}