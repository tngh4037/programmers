import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {

        return my_string.chars()
            .mapToObj(c -> c - 'a' < 0 ? String.valueOf((char) c).toLowerCase() : String.valueOf((char) c).toUpperCase())
            .collect(Collectors.joining());
    }
}