import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isIncluded = false;
            
            for (int delete_num: delete_list) {
                if (arr[i] == delete_num) {
                    isIncluded = true;
                    break;
                }
            }
            
            if (!isIncluded) {
                answer.add(arr[i]);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}