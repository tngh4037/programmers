import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int[] sNum = Arrays.stream(s.split(" "))
            .mapToInt(Integer::parseInt)
            .sorted()
            .toArray();
        
        return sNum[0] + " " + sNum[sNum.length-1];
    }
}