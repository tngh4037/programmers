import java.util.Arrays;

class Solution {
    public int solution(int n) {
        String n_str = "" + n;
        
        return Arrays.stream(n_str.split(""))
            .mapToInt(s -> Integer.parseInt(s))
            .sum();
    }
}