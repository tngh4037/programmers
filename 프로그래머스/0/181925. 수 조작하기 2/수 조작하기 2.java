class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            int diffNum = numLog[i] - numLog[i-1];
            sb.append(getResult(diffNum));
        }
        
        return sb.toString();
    }

    private String getResult(int diffNum) {
        switch (diffNum) {
            case 1:
                return "w";
            case -1:
                return "s";
            case 10:
                return "d";
            case -10:
                return "a";
            default:
                throw new IllegalArgumentException("unsupported argument");
        }
    }
}