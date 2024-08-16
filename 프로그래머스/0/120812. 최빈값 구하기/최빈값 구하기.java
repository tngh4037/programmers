import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int[] distNums = Arrays.stream(array).distinct().toArray();
        
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < distNums.length; i++) {
            int num = distNums[i];
            maps.put(distNums[i], (int) Arrays.stream(array)
                .filter(v -> v == num)
                .count());
        }
        
        int maxCount = 0;
        for (int value: maps.values()) {
            if (value > maxCount) {
                maxCount = value;
            }
        }
        
        int cnt = 0;
        int resultValue = 0;
        for (Map.Entry<Integer, Integer> ent: maps.entrySet()) {
            if (maxCount == ent.getValue()) {
                resultValue = ent.getKey();
                cnt++;
            }
        }
        
        if (cnt > 1) {
            return -1;
        }
        
        return resultValue;
    }
}