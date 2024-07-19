class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        String[] codeArr = code.split("");
        for (int i = 0; i < codeArr.length; i++) {
            if (i % q == r) {
                answer += codeArr[i];
            }
        }
        
        return answer;
    }
}