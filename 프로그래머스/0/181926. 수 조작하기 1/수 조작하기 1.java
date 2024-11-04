import java.util.Arrays;

class Solution {
    public int solution(int n, String control) {
 
        return Arrays.stream(control.split(""))
            .mapToInt(s -> getValue(s))
            .sum() + n;
    }
    
    public int getValue(String str) {
        if (str.equals("w")) {
            return 1;
        } else if (str.equals("s")) {
            return -1;
        } else if (str.equals("d")) {
            return 10;
        } else {
            return -10;
        }
    }
}