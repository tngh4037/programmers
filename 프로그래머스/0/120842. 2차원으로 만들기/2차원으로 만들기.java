import java.util.*;
import java.util.stream.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        
        List<Integer> nums = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        
        for (int row = 0; row < answer.length; row++) {
            List<Integer> temp = new ArrayList<>();
            
            for (int i = (row*n); i < nums.size(); i++) {
                temp.add(nums.get(i));

                if (((i+1) % n) == 0) {
                    break;
                }
            }

            answer[row] = temp.stream().mapToInt(Integer::intValue).toArray();
        }
        
        return answer;
    }
}