class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (String str: s.split("")) {
            if (str.equals(" ")) {
                sb.append(" ");
                index = 0;
                continue;
            }
            
            if (index % 2 == 0) {
                sb.append(str.toUpperCase());
            } else {
                sb.append(str.toLowerCase());
            }
            
            index++;
        }
        
        return sb.toString();
    }
}