import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] strArr = new String[strings.length];
        for (int i = 0; i < strArr.length; i++) {
            String word = strings[i].substring(n, n+1);
            strArr[i] = word + strings[i];
        }
        
        Arrays.sort(strArr);
        
        return Arrays.stream(strArr)
            .map(v -> v.substring(1, v.length())).
            toArray(String[]::new);
    }
}