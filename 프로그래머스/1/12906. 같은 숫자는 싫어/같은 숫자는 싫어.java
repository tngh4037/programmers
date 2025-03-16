import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
        for (int su : arr) {
            int num = stack.peek();
            if (su == num) {
                continue;
            }
            
            stack.push(su);
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}