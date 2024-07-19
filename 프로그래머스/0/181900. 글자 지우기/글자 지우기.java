class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] strs = my_string.split("");
        for (int indice: indices) {
            strs[indice] = "";
        }
        
        for (String str: strs) {
            if (!str.equals("")) {
                answer += str;
            }
        }
        
        return answer;
    }
}