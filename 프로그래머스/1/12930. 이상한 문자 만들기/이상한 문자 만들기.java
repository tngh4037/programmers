class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (char chr: s.toCharArray()) {
            if (chr == ' ') {
                index = 0;
                sb.append(chr);
                continue;
            }
            
            if (index % 2 == 0) {
                sb.append(Character.toUpperCase(chr));
            } else {
                sb.append(Character.toLowerCase(chr));
            }
            
            index++;
        }
        
        return sb.toString();
    }
}