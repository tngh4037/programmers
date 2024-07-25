class Solution {
    public int solution(int a, int b) {
        boolean a_odd = a % 2 != 0 ? true : false;
        boolean b_odd = b % 2 != 0 ? true : false;
        
        if (a_odd && b_odd) {
            return a*a + b*b;
        } else if (a_odd || b_odd) {
            return 2*(a+b);
        } else {
            int result = (a-b);
            return result < 0 ? (-1) * result : result;
        }
    }
}