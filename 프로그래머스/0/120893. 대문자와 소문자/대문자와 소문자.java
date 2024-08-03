class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (String str: my_string.split("")) {
           int code = (int) str.charAt(0);
           if (code >= 97 && code <= 122) {
               sb.append(str.toUpperCase());
           } else {
               sb.append(str.toLowerCase());
           }
        }
        
        return sb.toString();
    }
}