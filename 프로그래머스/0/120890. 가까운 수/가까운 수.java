import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        List<Integer> targets = new ArrayList<>();
        int n1 = n;
        int n2 = n;
        while (true) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == n1) {
                    targets.add(array[i]);
                    break;
                }
            }
            
            for (int i = 0; i < array.length; i++) {
                if (array[i] == n2) {
                    targets.add(array[i]);
                    break;
                }
            }
            
            if (targets.size() > 0) {
                break;
            }
            
            n1++;
            n2--;
        }

        int[] answer = targets.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(answer);

        return answer[0];
    }
}