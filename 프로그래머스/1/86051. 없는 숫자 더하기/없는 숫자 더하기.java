class Solution {
    public int solution(int[] numbers) {
        int sumAll = 0;
        for (int i: new int[]{1,2,3,4,5,6,7,8,9}) {
            sumAll += i;
        }
        
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        
        return sumAll - sum;
    }
}