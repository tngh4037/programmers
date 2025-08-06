import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        int[] answer = new int[26];
        
        s.chars().forEach(chr -> answer[chr - 'a']++);
        
        return IntStream.range(0, answer.length)
            .filter(i -> answer[i] == 1)
            .mapToObj(i -> String.valueOf(((char) (i + 'a'))))
            .collect(Collectors.joining());
    }
}