import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> storeValue = new ArrayList<>();
    
        int num = 2;
        while (n != 1) {
            if (n % num == 0) {
                n = n / num;
                storeValue.add(num);
            } else {
                num++;
            }
        }

        int[] answer = storeValue.stream().distinct().mapToInt(Integer::intValue).toArray();

        Arrays.sort(answer);
        
        return answer;
    }
}