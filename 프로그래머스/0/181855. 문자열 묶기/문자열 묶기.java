import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Long> collect = Arrays.stream(strArr)
            .collect(Collectors.groupingBy(
                str -> str.length(),
                Collectors.counting()
            ));
       
        return (int) collect.values()
            .stream()
            .mapToLong(Long::longValue)
            .max()
            .getAsLong();
    }
}