import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {

        Arrays.sort(d);
        
        int sum = 0;
        int count = 0;
        for (int needsMoney : d) {
            sum += needsMoney;
            if (sum > budget) {
                break;
            }
            
            count++;
        }
        
        return count;
    }
}