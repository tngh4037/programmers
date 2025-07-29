class Solution {
    public int solution(int num, int k) {
        String strNum = String.valueOf(num);
        int index = strNum.indexOf(String.valueOf(k));
        return index == -1 ? index : index+1;
    }
}