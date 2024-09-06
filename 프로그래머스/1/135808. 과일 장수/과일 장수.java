import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int boxCount = score.length / m;

        PriorityQueue<Integer> scoreList = new PriorityQueue<>(Collections.reverseOrder());
        for (int s: score) {
            scoreList.offer(s);
        }

        int index = boxCount;
        int sum = 0;
        while (index > 0) {
            
            int minValue = 1;
            for (int i = 0; i < m; i++) {
                minValue = scoreList.poll();
            }
            
            sum = sum + (minValue * m);
            
            index--;
        }

        return sum;
    }
}