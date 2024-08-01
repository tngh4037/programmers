class Solution {
    public int solution(int M, int N) {
        int maxValue = Math.max(M, N);
        int minValue = Math.min(M, N);
        
        return maxValue-1 + (maxValue * (minValue-1));
    }
}