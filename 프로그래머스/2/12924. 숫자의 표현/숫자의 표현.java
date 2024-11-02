class Solution {
    public int solution(int n) {
        int count = 0;

        int endValue = (n / 2);
        for (int i = 1; i <= endValue; i++) {
            
            int sum = i;
            for (int j = i+1; j <= endValue + 1; j++) {
                sum += j;
                
                if (sum == n) {
                    count++;
                    break;
                }
                if (sum > n) {
                    break;
                }
            }
        }
        
        return ++count; // 자기 자신 포함
    }
}