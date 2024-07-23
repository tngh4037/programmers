import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> lists = new ArrayList<>();
        for(int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                int loopCount = arr[i] * 2;
                for (int j = 0; j < loopCount; j++) {
                    lists.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    lists.remove(lists.size() - 1);
                }
            }
        }

        return lists.stream().mapToInt(Integer::intValue).toArray();
    }
}