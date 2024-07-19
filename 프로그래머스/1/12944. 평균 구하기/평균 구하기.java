class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for (int su: arr) {
            answer += su;
        }
        
        return answer / arr.length;
    }
}