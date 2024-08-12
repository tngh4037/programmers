class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int num1 = i;
            if (n % num1 == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}