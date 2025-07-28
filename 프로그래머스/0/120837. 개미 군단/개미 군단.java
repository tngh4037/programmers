class Solution {
    public int solution(int hp) {
        int target1 = hp / 5;
        hp = hp - (target1 * 5);
        
        int target2 = hp / 3;
        hp = hp - (target2 * 3);
        
        int target3 = hp / 1;
        
        return target1 + target2 + target3;
    }
}