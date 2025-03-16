import java.util.stream.Collectors;
import java.util.Collections;

class Solution {
    public String solution(String s) {

        return new StringBuilder().append(
                    s.chars()
                          .sorted()
                          .mapToObj(Character::toString)
                          .collect(Collectors.joining()))
               .reverse().toString();
    }
}