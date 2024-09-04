import java.util.*;
import java.util.stream.*;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < works.length; i++) {
            queue.offer(works[i]);
        }
        
        while(n > 0) {
            int work = queue.poll();
            if (work == 0) {
                break;
            }
            
            queue.offer(--work);
            
            n--;
        }
        
        long answer = 0;
        for(int work : queue) {
            answer += work * work;
        }
        
        return answer;
    }
}