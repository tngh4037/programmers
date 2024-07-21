class Solution {
    public int solution(String myString, String pat) {
        String lower_myString = myString.toLowerCase();
        String lower_pat = pat.toLowerCase();
        return lower_myString.contains(lower_pat) ? 1 : 0;
    }
}