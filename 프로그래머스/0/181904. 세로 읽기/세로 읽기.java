class Solution {
    public String solution(String my_string, int m, int c) {
        String[] strArr = my_string.split("");
        String answer = "";
        String temp = "";
        
        for (int i = 0; i < strArr.length; i++) {
            temp += strArr[i];
            
            if ((i+1) % m == 0) {
                answer += String.valueOf(temp.charAt(c - 1));
                temp = "";
            }
        }
        
        return answer;
    }
}