import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> lists = new ArrayList<>();
        for (int su: arr) {
            for (int i = 0; i < su; i++) {
                lists.add(su);
            }
        }
        
        return lists.stream().mapToInt(Integer::intValue).toArray();
    }
}