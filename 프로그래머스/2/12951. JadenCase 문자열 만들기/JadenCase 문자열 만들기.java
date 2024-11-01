import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        String[] strArr = s.split("");
        
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                strArr[0] = strArr[0].toUpperCase();
                continue;
            }
            
            char beforeChar = strArr[i-1].charAt(0);
            if (beforeChar == ' ') {
                strArr[i] = strArr[i].toUpperCase();
            }
        }

        return Arrays.stream(strArr).collect(Collectors.joining());
    }
    
}