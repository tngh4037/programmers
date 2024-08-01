import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n != 0) {
                numlist[i] = -1;
            }
        }
        
        return Arrays.stream(numlist).filter(v -> v != -1).toArray();
    }
}