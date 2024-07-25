class Solution {
    public int solution(int a, int b, int n) {
        int receiveSum = 0;
        
        while(true) {
            int mod = n / a;
            int divide = n % a;
            int receive = (mod * b); 
            
            receiveSum = receiveSum + receive;
            
            n = receive + divide;
            if (n < a) {
                break;
            }
        }
        
        return receiveSum;
    }
}