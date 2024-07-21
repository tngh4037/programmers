class Solution {
    public String solution(String myString) {
        String answer = "";

        String[] strArr = myString.split("");
        for (String str: strArr) {
            int code = (int) str.charAt(0);
            
            if (code == 97) {
                str = "A";
            }
            
            if (code > 65 && code <= 90) {
                str = str.toLowerCase();
            }
            
            answer += str;
        }
        
        return answer;
    }
}