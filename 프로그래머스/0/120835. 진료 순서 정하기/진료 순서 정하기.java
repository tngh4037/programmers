import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {

        return Arrays.stream(emergency)
            .map(num -> ((int) Arrays.stream(emergency).filter(i -> i > num).count()) + 1)
            .toArray();
    }
}