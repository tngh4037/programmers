import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Deque<Integer> store = new ArrayDeque<>();

        IntStream.range(0, flag.length)
            .forEach(i -> {
                    if (flag[i]) {
                        IntStream.range(0, arr[i]*2).forEach(j -> store.offerLast(arr[i]));
                    } else {
                        IntStream.range(0, arr[i]).forEach(j -> store.removeLast());
                    }
            });

        return store.stream().mapToInt(Integer::intValue).toArray();
    }
}