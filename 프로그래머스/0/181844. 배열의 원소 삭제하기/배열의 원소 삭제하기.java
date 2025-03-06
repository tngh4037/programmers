import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
 
        return Arrays.stream(arr)
            .filter(i -> !Arrays.stream(delete_list).anyMatch(j -> j == i))
            .toArray();
    }
}