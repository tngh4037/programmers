import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] target1 = Arrays.copyOf(num_list, n);
        int[] target2 = Arrays.copyOfRange(num_list, n, num_list.length);
        
        int[] answer = Arrays.copyOf(target2, target1.length + target2.length);
        System.arraycopy(target1, 0, answer, target2.length, target1.length);
        
        return answer;
    }
}