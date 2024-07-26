import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            nums.add(score[i]);
            
            int[] temp = nums.stream().mapToInt(Integer::intValue).toArray();
            
            Arrays.sort(temp);
            
            if (temp.length <= k) {
                answer[i] = temp[0];
            } else {
                answer[i] = temp[temp.length - k];
            }
        }
        
        return answer;
    }
}