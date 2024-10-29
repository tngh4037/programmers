import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
     
        return my_string.chars()
            .mapToObj(c -> (char) c)
            .map(String::valueOf)
            .map(s -> {
                int code = s.charAt(0);
                
                if (code >= 'a' && code <= 'z') {
                    return s.toUpperCase();
                } else {
                    return s.toLowerCase();
                }
            })
            .collect(Collectors.joining());
    }
}