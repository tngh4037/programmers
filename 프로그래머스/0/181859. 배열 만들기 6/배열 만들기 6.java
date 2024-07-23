import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> lists = new ArrayList<>();
        lists.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (lists.isEmpty()) {
                lists.add(arr[i]);
            } else {       
                if (arr[i] == lists.get(lists.size() - 1)) {
                    lists.remove(lists.size() - 1);
                } else {
                    lists.add(arr[i]);
                }
            }
        }
        
        if (lists.isEmpty()) {
            return new int[]{-1};
        }
        
        return lists.stream().mapToInt(Integer::intValue).toArray();
    }
}