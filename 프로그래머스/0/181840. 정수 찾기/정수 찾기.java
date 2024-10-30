import java.util.Arrays;

class Solution {
    public int solution(int[] num_list, int n) {
        int result = Arrays.stream(num_list).filter(num -> num == n).findFirst().orElse(0);

        return result > 0 ? 1 : 0;
    }
}