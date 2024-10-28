import java.util.*;
class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        
        int minValue = Arrays.stream(strArr).mapToInt(Integer::parseInt).min().orElse(0);
        int maxValue = Arrays.stream(strArr).mapToInt(Integer::parseInt).max().orElse(0);
        
        return minValue + " " + maxValue;
    }
}