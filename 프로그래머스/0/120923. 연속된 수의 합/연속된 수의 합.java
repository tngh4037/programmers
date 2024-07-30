import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int start = 0;
        int sum = 0;
        for (int i = start; i < start + num; i++) {
    		sum += i;
    	}
        
        start += (total-sum) / num;
        
        for (int i = 0; i < num; i++) {
    		answer[i] = start;
    		start++;
    	}
        
        return answer;
    }
}