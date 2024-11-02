import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] result = s.toCharArray();
        
        Arrays.sort(result);
        
        return new StringBuilder(new String(result)).reverse().toString();
    }
}