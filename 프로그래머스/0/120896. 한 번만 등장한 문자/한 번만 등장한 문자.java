import java.util.*;

class Solution {
    public String solution(String s) {
        int strLength = s.length();

        List<String> lists = new ArrayList<>();
        for (String str: s.split("")) {
            String temp = s.replace(str, "");
            if ((strLength - 1) == temp.length()) {
                lists.add(str);
            }
        }
        
        String[] answer = lists.stream().toArray(String[]::new);
        
        Arrays.sort(answer);
        
        return String.join("", answer);
    }
}