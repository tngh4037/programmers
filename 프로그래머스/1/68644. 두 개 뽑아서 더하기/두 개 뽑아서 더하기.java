import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) { 
                nums.add(numbers[i] + numbers[j]);
            }
        }
        
        answer = nums.stream().mapToInt(Integer::intValue).distinct().toArray();

        Arrays.sort(answer);
            
        return answer;
    }
}