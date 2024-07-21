class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArr = s.split(" ");
        int minValue = Integer.parseInt(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            minValue = Math.min(minValue, Integer.parseInt(strArr[i]));
        }
        
        int maxValue = Integer.parseInt(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            maxValue = Math.max(maxValue, Integer.parseInt(strArr[i]));
        }
        
        answer = "" + minValue + " " + maxValue;
        
        return answer;
    }
}