import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers) {
        return IntStream.of(numbers)
            .map(v -> v * 2)
            .toArray();
    }
}