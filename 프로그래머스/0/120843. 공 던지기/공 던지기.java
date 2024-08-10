class Solution {
    public int solution(int[] numbers, int k) {
        int index = 1;
        for (int i = 1; i < k; i++) {
            index += 2;
        }
        
        while (index > numbers.length) {
            index = index - numbers.length;
        }
        
        return numbers[index-1];
    }
}