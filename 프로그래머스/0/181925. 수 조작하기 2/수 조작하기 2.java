class Solution {
    public String solution(int[] numLog) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            int sepValue = numLog[i] - numLog[i-1];
            if (sepValue == 1) {
                result.append("w");
            } else if (sepValue == -1) {
                result.append("s");
            } else if (sepValue == 10) {
                result.append("d");
            } else if (sepValue == -10) {
                result.append("a");
            }
        }
        
        return result.toString();
    }
}