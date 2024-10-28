class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        long step = 0;
        for (int i = 1; i <= n; i++) {
            answer[i-1] = x + step;
            step += x;
        }
        
        return answer;
    }
}