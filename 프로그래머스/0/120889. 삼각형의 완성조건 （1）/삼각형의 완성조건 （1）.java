import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        int maxLength = sides[sides.length - 1];
        
        int sum = IntStream.of(sides).sum();

        return (sum - maxLength) > maxLength ? 1 : 2;
    }
}