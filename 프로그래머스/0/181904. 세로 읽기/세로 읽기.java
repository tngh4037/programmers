class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        
        int step = c-1;
        while (step <= (my_string.length()-1)) {
            answer.append(my_string.charAt(step));
            
            step += m;
        }
        
        return answer.toString();
    }
}
