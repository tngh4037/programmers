class Solution {
    public int solution(int n, int t) {
        int sum = 1;
        for (int i = 1; i <= t; i++) {
           sum = sum * 2;
        }
        
        return sum * n;
    }
}