import java.util.*;

class Solution {
    public String[] solution(String myStr) {
       
        String word = "";
        List<String> answer = new ArrayList<>();
        String[] strArr = myStr.split("");
        for (String str: strArr) {
            if (str.equals("a") || str.equals("b") || str.equals("c")) {
                if (!word.isEmpty()) {
                    answer.add(word);
                }
                word = "";
                continue;
            }
            
            word += str;
        }
        
        if (!word.isEmpty()) {
            answer.add(word);
        }
        
        
        if (answer.size() == 0) {
            return new String[]{"EMPTY"};
        }
        
        return answer.toArray(String[]::new);
    }
}