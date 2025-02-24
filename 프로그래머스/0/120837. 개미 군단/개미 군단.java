class Solution {
    public int solution(int hp) {
        int king = hp / 5;
        hp = hp - (king * 5);
        
        int mid = hp / 3;
        hp = hp - (mid * 3);
        
        return king + mid + hp;
    }
}