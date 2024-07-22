import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> lists = new ArrayList<>();
        for (int[] command: commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2]; 
            
            int[] temp = Arrays.copyOfRange(array, i - 1, j);
            
            Arrays.sort(temp); 
            
            lists.add(temp[k-1]);
        }
        
        return lists.stream().mapToInt(Integer::intValue).toArray();
    }
}