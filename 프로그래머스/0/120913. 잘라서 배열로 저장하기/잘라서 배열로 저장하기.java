import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_str.length(); i++) {
            sb.append(String.valueOf(my_str.charAt(i)));
            
            if ((i+1) % n == 0) {
                answer.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        
        if (!sb.toString().equals("")) {
            answer.add(sb.toString());
        }
        
        return answer.stream().toArray(String[]::new);
    }
}