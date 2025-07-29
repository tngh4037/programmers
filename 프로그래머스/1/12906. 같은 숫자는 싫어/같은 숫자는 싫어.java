import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> answer = new ArrayDeque<>();
        for (int num : arr) {
            Integer temp = answer.peekLast();
            if (temp == null) {
                answer.addLast(num);
                continue;
            }
            
            if (temp.equals(num)){
                continue;
            }
            
            answer.addLast(num);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}