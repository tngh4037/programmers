import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = String.valueOf(n);
        for (char chr: str.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(chr));
        }
        
        return answer;
    }
}