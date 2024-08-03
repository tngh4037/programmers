import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> arrs = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arrs.add(i);
            }
        }
        
        return arrs.stream().mapToInt(Integer::intValue).toArray();
    }
}