import java.util.stream.Stream;

class Solution {
    public int[] solution(int n) {
        
        return  Stream.concat(
                    Stream.iterate(n, i -> i != 1, i -> i % 2 == 0 ? i / 2 : 3 * i + 1),
                    Stream.of(1))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}