import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        /*
        int answer = 0;
        
        if (n % 2 == 0) {
            while (n != 0) {
                if (n % 2 == 0) {
                    answer += (n * n);
                }
                n--;
            }
        } else {
            while (n != 0) {
                if (n % 2 != 0) {
                    answer += n;
                }
                n--;
            }
        }
        
        return answer;
        */
        
        return (n % 2) != 0
                ? IntStream.rangeClosed(1, n)
                    .filter(num -> num % 2 != 0)
                    .sum()
                : IntStream.rangeClosed(1, n)
                    .filter(num -> num % 2 == 0)
                    .map(num -> num * num)
                    .sum();
    }
}