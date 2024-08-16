class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int sum = 0;
        while (true) {
            sum += 6;
            answer++;
            
            if (sum % n == 0) {
                break;
            }
        }
        
        return answer;
    }
}