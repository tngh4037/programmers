import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int rollerPosition = section[0];
        for (int i = 0; i < section.length; i++) {
            if (rollerPosition <= section[i]) {
                answer += 1;
                rollerPosition = section[i] + m;
            }
        }
        
        return answer;
    }
}