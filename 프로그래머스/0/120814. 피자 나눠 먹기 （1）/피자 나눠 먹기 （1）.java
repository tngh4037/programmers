class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int sum = 0;
        while (true) {
            sum += 7;
            answer++;
            
            if (sum >= n) {
                break;
            }
        }
        
        return answer;
    }
}