import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        String[] befores = before.split("");
        Arrays.sort(befores);
        String[] afters = after.split("");
        Arrays.sort(afters);
        
        for (int i = 0; i < befores.length; i++) {
            if (!befores[i].equals(afters[i])) {
                return 0;
            }
        }
        
        return 1;
    }
}