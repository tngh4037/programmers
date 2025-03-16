import java.util.stream.IntStream;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        IntStream.range(0, arr1.length)
            .forEach(i -> IntStream.range(0, arr1[0].length)
                            .forEach(j -> answer[i][j] = arr1[i][j] + arr2[i][j]));

        return answer;
    }
}