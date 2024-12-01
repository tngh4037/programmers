import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int target1 = numbers[0] * numbers[1];
        int target2 = numbers[numbers.length-1] * numbers[numbers.length-2];

        return target1 > target2 ? target1 : target2;
    }
}