import java.util.*;

class Solution {
    public int solution(String s) {
        List<Integer> answer = new ArrayList<>();
        String[] strArr = s.split(" ");
        for (String str: strArr) {
            if (str.equals("Z")) {
                answer.remove(answer.size() - 1);
            } else {
                answer.add(Integer.parseInt(str));
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).sum();
    }
}