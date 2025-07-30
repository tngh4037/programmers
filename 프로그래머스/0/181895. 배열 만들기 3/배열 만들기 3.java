import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] target1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1]+1);
        int[] target2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1]+1);
        int[] answer = new int[target1.length + target2.length];
        
        System.arraycopy(target1, 0, answer, 0, target1.length);
        System.arraycopy(target2, 0, answer, target1.length, target2.length);
        
        return answer;
    }
}