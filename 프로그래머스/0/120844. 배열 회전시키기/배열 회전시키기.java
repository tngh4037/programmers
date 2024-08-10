import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> nums = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        
        if (direction.equals("right")) {
            int value = nums.get(nums.size() - 1);
            nums.add(0, value);
            nums.remove(nums.size() - 1);
        } else {
            int value = nums.get(0);
            nums.remove(0);
            nums.add(value);
        }
        
        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
}