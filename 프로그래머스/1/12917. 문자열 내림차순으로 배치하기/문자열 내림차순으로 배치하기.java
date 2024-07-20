import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        Arrays.sort(str);
        
        for (String key: str) {
            answer += key;
        }
        
        StringBuilder sb = new StringBuilder(answer);
        sb.reverse();
        return sb.toString();
    }
}