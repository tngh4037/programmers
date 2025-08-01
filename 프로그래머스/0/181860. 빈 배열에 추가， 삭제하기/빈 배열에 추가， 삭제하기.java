import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, boolean[] flags) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < flags.length; i++) {
            if (flags[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    answer.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    answer.remove(answer.size() - 1);
                }
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}