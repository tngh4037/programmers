class Solution {
    boolean solution(String s) {

        int orgLength = s.length();
        int pLength = s.toLowerCase().replace("p", "").length();
        int yLength = s.toLowerCase().replace("y", "").length();
        
        if (orgLength == pLength && orgLength == yLength) {
            return true;
        } else if (pLength == yLength) {
            return true;
        } else {
            return false;
        }
    }
}