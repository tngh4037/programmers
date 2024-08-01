import java.util.*;

class Solution {
    public String solution(String my_string) {
        String lower_str = my_string.toLowerCase();
        String[] arrs = lower_str.split("");
        
        Arrays.sort(arrs);

        return String.join("", arrs);
    }
}