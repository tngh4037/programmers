import java.util.stream.IntStream;

class Solution {
    public int solution(int[][] arr) {
        
        return IntStream.range(0, arr.length)
            .anyMatch(i -> !IntStream.range(0, arr.length).allMatch(j -> arr[i][j] == arr[j][i])) ? 0 : 1;
    }
}