class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            if (targetPlus(i)) {
                answer = answer + i;
            } else {
                answer = answer + ((-1) * i);
            }
        }
        
        return answer;
    }
    
    private boolean targetPlus(int su) {
        int count = 0;
        for (int i = 1; i <= su; i++) {
            if (su % i == 0) {
                count++;
            }
        }
        
        return count % 2 == 0;
    }
}