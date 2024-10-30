import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        return IntStream.rangeClosed(0, arr.length-1)
            .map(i -> {
                if (arr.length % 2 == 0) {
                    if (i % 2 != 0) {
                        return arr[i] + n;
                    } else {
                        return arr[i];
                    }
                } else {
                    if (i % 2 == 0) {
                        return arr[i] + n;
                    } else {
                        return arr[i];
                    }
                }
            }).toArray();
    }
}