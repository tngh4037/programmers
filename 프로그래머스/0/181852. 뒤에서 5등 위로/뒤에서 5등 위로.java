import java.util.stream.IntStream;
import java.util.Collections;

class Solution {
    public int[] solution(int[] num_list) {
        
        return IntStream.of(num_list)
            .boxed()
            .sorted(Collections.reverseOrder())
            .limit(num_list.length - 5)
            .mapToInt(Integer::intValue)
            .sorted()
            .toArray();
    }
}