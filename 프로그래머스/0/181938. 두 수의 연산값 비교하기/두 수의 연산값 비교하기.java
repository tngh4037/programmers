class Solution {
    public int solution(int a, int b) {
        int target1 = Integer.parseInt(a + "" + b);
        int target2 = 2 * a * b;
        
        if (target1 < target2) {
            return target2;
        }
        
        return target1;
    }
}