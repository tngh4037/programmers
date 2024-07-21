class Solution {
    public String solution(String myString, String pat) {
        int length = 0;
        if (pat.length() > 1) {
            length = pat.length() - 1;
        }
        
        return myString.substring(0, myString.lastIndexOf(pat) + length + 1);
    }
}