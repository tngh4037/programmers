class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String prefix = my_string.substring(0, s);
        String suffix = my_string.substring(overwrite_string.length()+s, my_string.length());
        
        String answer = prefix + overwrite_string + suffix;
        return answer;
    }
}