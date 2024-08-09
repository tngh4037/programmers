class Solution {
    public int solution(int n) {
        int loopCount = 1;
        int num = 1;
        while (true) {
            if (num > n) {
                break;
            }
            
            num = num * (loopCount + 1);
            loopCount++;
        }
        
        return loopCount - 1;
    }
}