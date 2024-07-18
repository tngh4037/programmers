import java.util.*;

class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n)).reverse();
        String str = sb.toString();
        
        List<Integer> arrs = new ArrayList<>();
        for (char chr: str.toCharArray()) {
            arrs.add(chr - '0');
        }
        
        return arrs.stream().mapToInt(Integer::intValue).toArray();
    }
}