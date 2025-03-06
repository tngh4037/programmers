class Solution {
    public int solution(int a, int b) {
        boolean isEvenForA = (a % 2 == 0);
        boolean isEvenForB = (b % 2 == 0);
        
        if (isEvenForA && isEvenForB) {
            return Math.abs(a - b);
        } else if (isEvenForA || isEvenForB) {
            return 2 * (a + b);
        } else {
            return (a*a) + (b*b);
        }
    }
}