class Solution {
    public int solution(int n) {
        int answer = 0;
        int index = 1;
        while (index <= n) {
            int sum = 0;
            
            for (int i = index; i <= n; i++) {
                sum += i;
                if (sum == n) {
                    answer++;
                }
                
                if (sum > n) {
                    break;
                }
            }
            
            index++;
        }
        
        return answer;
    }
}