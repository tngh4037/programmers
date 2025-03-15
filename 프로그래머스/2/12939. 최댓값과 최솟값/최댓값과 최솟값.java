import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int minValue = Arrays.stream(s.split(" "))
            .mapToInt(Integer::parseInt)
            .min()
            .getAsInt();
        
        int maxValue = Arrays.stream(s.split(" "))
            .mapToInt(Integer::parseInt)
            .max()
            .getAsInt();
        
        return "" + minValue + " " + maxValue;
    }
}