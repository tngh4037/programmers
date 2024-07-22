import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        
        List<String> arrs = new ArrayList<>();
        for (String str: strArr) {
            if (!str.contains("ad")) {
                arrs.add(str);
            }
        }
        
        return arrs.toArray(String[]::new);
    }
}