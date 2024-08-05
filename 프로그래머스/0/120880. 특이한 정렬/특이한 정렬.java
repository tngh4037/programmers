import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] targets = new Integer[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            targets[i] = numlist[i];
        }
        
        Arrays.sort(targets, (a, b) -> {
            int a_num = Math.abs(a - n);
            int b_num = Math.abs(b - n);
            
            if (a_num == b_num) {
                return Integer.compare(b, a);
            } else {
                return Integer.compare(a_num, b_num);
            }
        });
        
        return Arrays.stream(targets).mapToInt(Integer::intValue).toArray();
    }
}