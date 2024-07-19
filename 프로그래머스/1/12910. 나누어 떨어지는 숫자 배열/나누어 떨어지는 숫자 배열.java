import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();
        for(int su: arr) {
            if (su % divisor == 0) {
                result.add(su);
            }
        }
        
        if (result.size() == 0) {
            return new int[]{-1};
        }
        
        Collections.sort(result);
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}