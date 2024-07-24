import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> targets = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                targets.add(rank[i]);
            }
        }
        
        int[] filter_targets = targets.stream().mapToInt(Integer::intValue).toArray();
        
        Arrays.sort(filter_targets);
        
        int a = filter_targets[0];
        int b = filter_targets[1];
        int c = filter_targets[2];
        
        int[] result = new int[3];
        for (int i = 0; i < rank.length; i++) {
            if (rank[i] == a) { 
                result[0] = i;
            } else if (rank[i] == b) { 
                result[1] = i;
            } else if (rank[i] == c) { 
                result[2] = i;
            }
        }
        
        return 10000 * result[0] + 100 * result[1] + result[2];
    }
}