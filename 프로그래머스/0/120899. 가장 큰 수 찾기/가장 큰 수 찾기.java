import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array) {
        int maxValue = Arrays.stream(array)
            .max()
            .orElseThrow(() -> new IllegalArgumentException());
        
        int index = Arrays.stream(array)
            .boxed()
            .collect(Collectors.toList())
            .indexOf(maxValue);
        
        return new int[]{
            maxValue,
            index
        };
    }
}