import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[IntStream.of(arr).sum()];
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            
            for (int j = 0; j < num; j++) {
                result.add(num);
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}