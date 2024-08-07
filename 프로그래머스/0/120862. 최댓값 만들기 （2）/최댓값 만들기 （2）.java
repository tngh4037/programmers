class Solution {
    public int solution(int[] numbers) {
        int maxValue = numbers[0] * numbers[1];
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int temp = numbers[i] * numbers[j];
                maxValue = Math.max(maxValue, temp);
            }
        }
        
        return maxValue;
    }
}