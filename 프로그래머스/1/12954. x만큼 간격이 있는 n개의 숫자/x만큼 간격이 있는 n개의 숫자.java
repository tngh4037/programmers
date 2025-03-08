import java.util.List;
import java.util.ArrayList;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> answer = new ArrayList<>();
        long value = x;
        int step = x;
        while (n != 0) {
            answer.add((long) value);
            value = value + step;
            
            n--; 
        }
        
        return answer.stream().mapToLong(Long::longValue).toArray();
    }
}