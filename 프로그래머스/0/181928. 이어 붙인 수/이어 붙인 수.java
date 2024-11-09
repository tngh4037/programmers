import java.util.stream.*;
import java.util.*;

class Solution {
    
    public int solution(int[] num_list) {
        int answer = 0;
        
        String str1 = IntStream.range(0, num_list.length)
            .filter(i -> num_list[i] % 2 != 0)
            .mapToObj(i -> String.valueOf(num_list[i]))
            .collect(Collectors.joining());
        
        String str2 = IntStream.range(0, num_list.length)
            .filter(i -> num_list[i] % 2 == 0)
            .mapToObj(i -> String.valueOf(num_list[i]))
            .collect(Collectors.joining());
        
        return Integer.parseInt(str2) + Integer.parseInt(str1);
    }
}