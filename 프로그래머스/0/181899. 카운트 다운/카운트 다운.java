import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> nums = new ArrayList<>();
        for (int i = start_num; i >= end_num; i--) {
            nums.add(i);
        }
        
        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
}