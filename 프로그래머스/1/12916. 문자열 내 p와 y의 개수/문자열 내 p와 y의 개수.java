class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        
        int yLength = s.replace("y", "").length();
        int pLength = s.replace("p", "").length();
        
        return yLength == pLength ? true : false;
    }
}