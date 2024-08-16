class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        int sum = 0;
        while (true) {
            sum += slice;
            answer++;
            
            if (sum >= n) {
                break;
            }
        }
        
        return answer;
    }
}