class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < numLog.length-1; i++) {
            int result = numLog[i + 1] - numLog[i];
            if (result == 1) {
                sb.append("w");
            } else if (result == -1) {
                sb.append("s");
            } else if (result == 10) {
                sb.append("d"); 
            } else {
                sb.append("a");
            }
        }
        
        return sb.toString();
    }
}