import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] array) {
        int[] copyArray = Arrays.copyOfRange(array, 0, array.length);
        
        Arrays.sort(array);
        
        int maxValue = array[array.length - 1];
        
        int[] indexs = IntStream.range(0, copyArray.length)
            .filter(i -> copyArray[i] == maxValue)
            .toArray();
        
        return new int[]{maxValue, indexs[0]};
    }
}