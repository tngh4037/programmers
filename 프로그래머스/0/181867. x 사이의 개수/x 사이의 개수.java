import java.util.*;

class Solution {
    public int[] solution(String myString) {
        
        List<Integer> answer = new ArrayList<>();
        String[] strArr = myString.split("");
        int count = 0;
        for (String str: strArr) {
            if (str.equals("x")) {
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