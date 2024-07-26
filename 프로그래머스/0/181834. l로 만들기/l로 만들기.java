class Solution {
    public String solution(String myString) {
        int code = (int) 'l';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            int str_code = (char) myString.charAt(i);
            if (str_code < code) {
                sb.append('l');
            } else {
                sb.append(myString.charAt(i));
            }
        }
        
        return sb.toString();
    }
}