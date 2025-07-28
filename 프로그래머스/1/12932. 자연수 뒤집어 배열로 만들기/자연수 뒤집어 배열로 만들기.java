import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        
        sb.reverse();
        
        return Arrays.stream(sb.toString().split("")).mapToInt(Integer::parseInt).toArray();
    }
}