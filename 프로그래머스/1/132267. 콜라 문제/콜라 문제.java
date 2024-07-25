class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(true) {
            int mod = n / a;
            int divide = n % a;
            
            answer = answer + ((n / a) * b);
            
            n = ((n / a) * b) + divide;
            if (n < a) {
                break;
            }
        }
        
        return answer;
    }
}