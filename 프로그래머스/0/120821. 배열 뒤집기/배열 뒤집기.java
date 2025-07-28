import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] num_list) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int num: num_list) {
            queue.push(num);
        }
        
        return queue.stream().mapToInt(Integer::intValue).toArray();
    }
}