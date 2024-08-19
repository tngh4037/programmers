import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};

        List<Integer> temp = new ArrayList<>();
        for (int su = l; su <= r; su++) {
            String str = String.valueOf(su);
            
            for (char c: str.toCharArray()) {
                int code = (int) c;
                if (code != 48 && code != 53) {
                    str = null;
                    break;
                }
            }
            
            if (str != null) {
               temp.add(Integer.parseInt(str)); 
            }
        }
        
        answer = temp.stream().mapToInt(Integer::valueOf).toArray();
        
        Arrays.sort(answer);
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}