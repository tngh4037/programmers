import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        for (int[] query: queries) {
            Collections.swap(arrList, query[0], query[1]);
        }
        
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}