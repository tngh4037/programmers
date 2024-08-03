import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String order_str = String.valueOf(order);
        for (String str: order_str.split("")) {
            if (str.equals("3") || str.equals("6") || str.equals("9")) {
                answer++;
            }
        }
        
        return answer;
    }
}