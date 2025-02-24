import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] numlist) {

        return IntStream.range(0, numlist.length)
            .filter(i -> numlist[i] % n == 0)
            .map(i -> numlist[i])
            .toArray();
    }
}