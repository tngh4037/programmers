import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int[] query: queries) {
            int x = query[0];
            int y = query[1];
            
            int temp = answer[x];
            answer[x] = answer[y];
            answer[y] = temp;
        }
        
        return answer;
    }
}