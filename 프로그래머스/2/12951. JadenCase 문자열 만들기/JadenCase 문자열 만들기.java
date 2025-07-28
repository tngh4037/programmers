class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        boolean isFirst = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            
            if (chr >= 'a' && chr <= 'z') {
                if (isFirst) {
                    sb.append(String.valueOf(chr).toUpperCase());
                    isFirst = false;
                    continue;
                }
            } else if (chr == ' ') {
                isFirst = true;
            } else {
                isFirst = false;
            }
            
            sb.append(chr);
        }
        
        return sb.toString();
    }
}