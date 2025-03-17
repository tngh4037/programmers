import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        for (int[] interval: intervals) {
            int toIndex = interval[0];
            int fromIndex = interval[1];

            for (int i = toIndex; i < fromIndex+1; i++) {
                answer.add(arr[i]);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}