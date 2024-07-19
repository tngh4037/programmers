class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                sum = sum + absolutes[i];
            } else {
                sum = sum + ((-1) * absolutes[i]);
            }
        }
        
        return sum;
    }
}