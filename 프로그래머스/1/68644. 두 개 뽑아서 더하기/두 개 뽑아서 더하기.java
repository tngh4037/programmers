import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> numSet = new HashSet<>();
        IntStream.range(0, numbers.length - 1)
                    .forEach(num -> IntStream.range(num+1, numbers.length)
                                    .forEach(i -> numSet.add(numbers[num] + numbers[i]))
                    );
        
        return numSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}