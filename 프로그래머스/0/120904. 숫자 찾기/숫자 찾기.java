class Solution {
    public int solution(int num, int k) {
        String number = "" + num;
        int index = number.indexOf(String.valueOf(k));
        if (index != -1) {
            return index + 1;
        }
        
        return index;
    }
}