import java.util.Arrays;

class Solution {
    public int solution(int order) {
        
        return (int) Arrays.stream(String.valueOf(order).split(""))
            .filter(str -> str.equals("3") || str.equals("6") || str.equals("9"))
            .count();
    }
}