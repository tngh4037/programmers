import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        List<Integer> nums = new ArrayList<>();
        int temp = arr[0];
        nums.add(temp);
        
        for (int i = 1; i < arr.length; i++) {
            if (temp == arr[i]) {
                continue;
            } else {
                temp = arr[i];
                nums.add(temp);
            }
        }

        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
}