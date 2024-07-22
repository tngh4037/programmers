import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] strArr = myString.split("x");
        
        List<String> strs = new ArrayList<>();
        for (String str: strArr) {
            String target = str.trim();
            if (!target.isEmpty()) {
                strs.add(target);
            }
        }
        
        strArr = strs.toArray(String[]::new);
        
        Arrays.sort(strArr);

        return strArr;
    }
}