import java.util.stream.*;

class Solution {
    public int solution(String myString, String pat) {
        return myString.chars()
            .mapToObj(c -> (char) (c == 'A' ? c + 1 : c - 1))
            .map(String::valueOf)
            .collect(Collectors.joining()).contains(pat) ? 1 : 0;
    }
}