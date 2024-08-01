import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int takeCount = nums.length / 2;
        if (set.size() > takeCount) {
            return takeCount;
        }

        return set.size();
    }
}