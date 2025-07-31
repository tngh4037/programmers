class Solution {
    public int solution(int n) {
        int slice = 6;
        int count = 1;
        while (true) {
            if ((slice * count) % n == 0) {
                break;
            }
            
            count++;
        }
        
        return count;
    }
}