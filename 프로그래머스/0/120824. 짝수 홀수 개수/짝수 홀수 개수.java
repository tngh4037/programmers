import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {

        return new int[]{
            (int) IntStream.range(0, num_list.length)
            .filter(i -> num_list[i] % 2 == 0)
            .count(), 
            (int) IntStream.range(0, num_list.length)
            .filter(i -> num_list[i] % 2 != 0)
            .count()
        };
    }
}