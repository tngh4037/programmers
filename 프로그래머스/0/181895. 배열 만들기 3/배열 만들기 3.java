import java.util.Arrays;
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> numbers = new ArrayList<>();
        for (int[] interval: intervals) {
            for (int i = interval[0]; i <= interval[1]; i++) {
                numbers.add(arr[i]);
            }
        }

        return numbers.stream().mapToInt(Integer::intValue).toArray();
    }
}