import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public String solution(String cipher, int code) {
        return IntStream.range(0, cipher.length())
            .filter(i -> ((i+1) % code) == 0)
            .mapToObj(i -> String.valueOf(cipher.charAt(i)))
            .collect(Collectors.joining());
    }
}