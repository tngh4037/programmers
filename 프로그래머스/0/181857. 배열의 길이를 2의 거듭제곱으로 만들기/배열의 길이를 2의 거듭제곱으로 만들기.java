import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        
        int sum;
        int index = 1;
        
        while (true) {
            sum = (int) Math.pow(2, index++);
            if (arr.length <= sum) {
                break;
            }
        }

        return IntStream.range(0, sum)
            .map(i -> {
                if (i < arr.length) {
                    return arr[i];
                } else {
                    return 0;
                }
            }).toArray();
    }
}