class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        
        int target1 = Integer.parseInt(strA + strB);
        int target2 = Integer.parseInt(strB + strA);
        
        if (target1 < target2) {
            return target2;
        }
        
        return target1;
    }
}