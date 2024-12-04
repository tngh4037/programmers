import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public String solution(String cipher, int code) {
        String[] cipherArr = cipher.split("");

        return IntStream.range(0, cipherArr.length)
            .filter(i -> ((i+1) % code) == 0)
            .mapToObj(i -> cipherArr[i])
            .collect(Collectors.joining());
    }
}