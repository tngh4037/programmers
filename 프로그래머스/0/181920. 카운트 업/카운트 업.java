import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> arrs = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            arrs.add(i);
        }
        
        return arrs.stream().mapToInt(Integer::intValue).toArray();
    }
}