import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int maxValue = Arrays.stream(array)
            .max().orElse(-1);
        
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) {
                index = i;
                break;
            }
        }
        
        return new int[]{maxValue, index};
    }
}