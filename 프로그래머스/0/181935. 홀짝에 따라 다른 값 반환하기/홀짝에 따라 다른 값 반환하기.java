import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        
        return n % 2 == 0 ? 
            IntStream.rangeClosed(1, n)
                    .filter(su -> su % 2 == 0)
                    .map(su -> su*su)
                    .sum() :
            IntStream.rangeClosed(1, n)
                    .filter(su -> su % 2 != 0)
                    .sum();
    }
}