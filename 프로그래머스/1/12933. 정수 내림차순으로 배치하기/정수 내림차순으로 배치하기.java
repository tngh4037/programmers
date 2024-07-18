import java.util.*;

class Solution {
    public long solution(long n) {
        String[] strArr = String.valueOf(n).split("");
        Arrays.sort(strArr);
        
        StringBuilder sb = new StringBuilder();
        for (String str: strArr) {
            sb.append(str);
        }
        
        return Long.parseLong(sb.reverse().toString());
    }
}