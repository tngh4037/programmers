import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int takeCount = nums.length / 2;
        int[] copyNums = Arrays.stream(nums).distinct().toArray();
        if (copyNums.length >= takeCount) {
            return takeCount;
        }

        return copyNums.length;
    }
}