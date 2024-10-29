class Solution {
    public int solution(int hp) {
        int ant1 = hp / 5;
        hp = hp % 5;
        
        int ant2 = hp / 3;
        hp = hp % 3;
        
        int ant3 = hp;
        
        return ant1 + ant2 + ant3;
    }
}
// 장군개미: 5
// 병정개미: 3
// 일개미: 1