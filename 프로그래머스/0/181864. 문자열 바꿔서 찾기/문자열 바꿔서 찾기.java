import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String myString, String pat) {
        String myString_new = Arrays.stream(myString.split(""))
            .map(s -> s.equals("A") ? "B" : "A")
            .collect(Collectors.joining());
        
        return myString_new.contains(pat) ? 1 : 0;
    }
}