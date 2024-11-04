import java.util.stream.*;

class Solution {
    public String solution(int[] numLog) {

        return IntStream.range(1, numLog.length)
            .mapToObj(operand -> get(numLog[operand-1], numLog[operand]))
            .collect(Collectors.joining());
    }
    
    public String get(int beforeNum, int afterNum) {
        int num = afterNum - beforeNum;
        if (num == 1) {
            return "w";
        } else if (num == -1) {
            return "s";
        } else if (num == 10) {
            return "d";
        } else {
            return "a";
        }
    }
    
}