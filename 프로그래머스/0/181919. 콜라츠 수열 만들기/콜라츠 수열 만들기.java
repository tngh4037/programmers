import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        List<Integer> arrs = new ArrayList<>();
        arrs.add(n);
        
        int target = n;
        while(target != 1) {
            if (target % 2 == 0) {
                target = target / 2;
                arrs.add(target);
            } else {
                target = 3 * target + 1;
                arrs.add(target);
            }
        }
        
        return arrs.stream().mapToInt(Integer::intValue).toArray();
    }
}