import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {

        return Arrays.stream(arr)
            .flatMap(i -> IntStream.range(0, i).map(j -> i))
            .toArray();
    }
}