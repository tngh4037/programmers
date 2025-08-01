import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for (int acc: d) {
            if (budget >= acc) {
                budget -= acc;
                answer++;
                continue;
            }
            
            break;
        }

        return answer;
    }
}