import java.util.stream.*;

class Solution {
    public String solution(String myString) {
        return myString.chars()
            .mapToObj(c -> c - 'a' == 0 ? String.valueOf((char) c).toUpperCase() : String.valueOf((char) c))
            .map(s -> s.equals("A") ? s : s.toLowerCase())
            .collect(Collectors.joining());
    }
}