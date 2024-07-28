class Solution {
    public int solution(int[] common) {
        int value1 = common[0];
        int value2 = common[1];
        int value3 = common[2];
        
        int step1 = value2 - value1;
        int step2 = value3 - value2;
        
        if (step1 == step2) {
            return common[common.length-1] + step1;
        } else {
            return common[common.length-1] * (value2 / value1);
        }
    }
}