import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            if (i == 0 || (i % n == 0)) {
                nums.add(num_list[i]);
            }
        }
        
        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
}