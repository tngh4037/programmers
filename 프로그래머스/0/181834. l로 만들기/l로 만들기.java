import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {

        return myString.chars()
            .map(c -> c - 'l' < 0 ? 'l' : c)
            .mapToObj(c -> String.valueOf((char) c))
            .collect(Collectors.joining());
    }
}