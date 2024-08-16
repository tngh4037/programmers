import java.util.*;

class Solution {
    public int solution(int[] array) {
        int middleIndex = array.length / 2;
        
        Arrays.sort(array);
        
        return array[middleIndex];
    }
}