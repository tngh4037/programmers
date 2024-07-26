import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answers = new ArrayList<>();
        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < picture[i].length(); j++) {
                String str = String.valueOf(picture[i].charAt(j));
                sb.append(str.repeat(k));
            }

            for (int z = 0; z < k; z++) {
                answers.add(sb.toString());
            }
        }
        
        return answers.toArray(String[]::new);
    }
}