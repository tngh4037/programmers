import java.util.stream.IntStream;

class Solution {
    public String solution(String[] seoul) {
        int index = IntStream.range(0, seoul.length)
            .filter(i -> seoul[i].equals("Kim"))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Unsupported Arguments"));

        return "김서방은 " + index + "에 있다";
    }
}