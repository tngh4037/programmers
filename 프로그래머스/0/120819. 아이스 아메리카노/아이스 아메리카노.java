class Solution {
    public int[] solution(int money) {
        int americanoCount = money / 5500;
        int balance = money - (5500 * americanoCount);
        
        return new int[]{americanoCount, balance};
    }
}