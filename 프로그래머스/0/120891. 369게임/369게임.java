import java.util.Arrays;

class Solution {
    public int solution(int order) {
        String strOrder = String.valueOf(order);
        
        return (int) Arrays.stream(strOrder.split(""))
            .filter(s -> !s.equals("0") && Integer.parseInt(s) % 3 == 0)
            .count();
    }
}