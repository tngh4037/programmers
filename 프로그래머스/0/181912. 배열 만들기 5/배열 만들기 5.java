import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> arrs = new ArrayList<>();
        for (String intStr: intStrs) {
            int num = Integer.parseInt(intStr.substring(s, s + l));
            if (num > k) {
                arrs.add(num);
            }
        }
        
        return arrs.stream().mapToInt(Integer::intValue).toArray();
    }
}