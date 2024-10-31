import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        List<String> answer = new ArrayList<>();
        
        String[] strArr = my_string.split("");
        for (String str: strArr) {
            if (str.equals(" ")) {
                String temp = sb.toString();
                if (!temp.isEmpty()) {
                    answer.add(sb.toString());
                }
                
                sb = new StringBuilder();
                continue;
            }
            
            sb.append(str);
        }
 
        String temp = sb.toString();
        if (!temp.isEmpty()) {
            answer.add(sb.toString());
        }
        
        return answer.stream().toArray(String[]::new);
    }
}