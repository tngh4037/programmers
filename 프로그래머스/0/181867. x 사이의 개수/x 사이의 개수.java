import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        
        int count = 0;
        char[] myChars = myString.toCharArray();
        for (char chr : myChars) {
            if (chr == 'x') {
                answer.add(count);
                count = 0;
                continue;
            }
            
            count++;
        }

        answer.add(count);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}