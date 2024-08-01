class Solution {
    public int solution(int n) {
        int num = 1;
        while (true) {
            long result = num * num;
            
            if (result == n) {
                return 1;
            }
            
            if (result > n) {
                return 2;
            }
            
            num++;
        }
    }
}