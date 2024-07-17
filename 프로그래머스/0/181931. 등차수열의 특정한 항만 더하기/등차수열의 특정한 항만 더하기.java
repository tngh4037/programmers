import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        /*
        int answer = 0;
        
        int index = 0;
        for (boolean result: included) {
            if (result) {
                if (index == 0) {
                    answer += a;
                } else {
                    answer += (a + (d * index));
                }
            }
            index++;
        }
        
        return answer;
        */
        
        return IntStream.range(0, included.length).map(idx -> included[idx] ? a + (idx * d) : 0).sum();
    }
}