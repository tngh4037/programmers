import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] strArr) {
        
        return IntStream.range(0, strArr.length)
            .mapToObj(i -> i % 2 == 0 ? 
                      strArr[i].toLowerCase() : strArr[i].toUpperCase())
            .toArray(String[]::new);
    }
}
