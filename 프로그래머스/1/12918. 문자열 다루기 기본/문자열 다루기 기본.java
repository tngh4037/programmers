class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            answer = false;
        }
        
        return answer ? (s.length() == 4 || s.length() == 6) : answer;
    }
}