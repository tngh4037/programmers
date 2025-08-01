import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        
        return IntStream.range(0, num_list.length)
            .map(i -> getCount(num_list[i]))
            .sum();
    }
    
    private int getCount(int num) {
        int count = 0;
        
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num - 1) / 2;
            }
            count++;
        }
        
        return count;
    }
    
}