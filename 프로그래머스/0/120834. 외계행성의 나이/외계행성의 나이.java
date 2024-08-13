class Solution {
    public String solution(int age) {
        String answer = "";
        
        String[] ageArr = String.valueOf(age).split("");
        for (String strAge: ageArr) {
            char temp = (char) ('a' + Integer.parseInt(strAge));
            answer += String.valueOf(temp);
        }
        
        return answer;
    }
}