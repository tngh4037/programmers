class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        char[] chars = s.toCharArray();
        for (char chr : chars) {
            if (Character.isDigit(chr) && isFirst) {
                isFirst = false;
                sb.append(chr);
                continue;
            }
             
            if (chr == ' ') {
                isFirst = true;
                sb.append(chr);
                continue;
            }
            
            if (isFirst) {
                sb.append(String.valueOf(chr).toUpperCase());
                isFirst = false;
            } else {
                sb.append(String.valueOf(chr).toLowerCase());
            }
        }
        
        return sb.toString();
    }
}