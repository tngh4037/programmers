import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] seoul) {
        List<String> slist = Arrays.stream(seoul)
            .collect(Collectors.toList());
        
        return "김서방은 " + slist.indexOf("Kim") + "에 있다";
    }
}