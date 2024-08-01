import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] copyArr = Arrays.copyOf(array, array.length);
        
        Arrays.sort(copyArr);
        
        int maxValue = copyArr[copyArr.length-1];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) {
                return new int[]{maxValue, i};
            }
        }
        
        return new int[]{};
    }
}