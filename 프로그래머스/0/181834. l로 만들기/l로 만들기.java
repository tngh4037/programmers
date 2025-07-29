class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (char chr: myString.toCharArray()) {
            if (chr < 'l') {
                sb.append('l');
            } else {
                sb.append(chr);
            }
        }
        
        return sb.toString();
    }
}