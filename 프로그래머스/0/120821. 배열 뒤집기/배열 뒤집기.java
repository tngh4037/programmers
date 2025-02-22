import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> nums = Arrays.stream(num_list).mapToObj(Integer::valueOf).collect(Collectors.toList());
        Collections.reverse(nums);
        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
}