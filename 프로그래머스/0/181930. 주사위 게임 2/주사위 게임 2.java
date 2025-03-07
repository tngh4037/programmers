import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int b, int c) {
        int count = (int) IntStream.of(a, b, c)
            .distinct()
            .count();
        
        if (count == 3) {
            return  a + b + c;
        } else if (count == 2) {
            return (a + b + c) * ((a*a) + (b*b) + (c*c));
        } else {
            return (a + b + c) * ((a*a) + (b*b) + (c*c)) * ((a*a*a) + (b*b*b) + (c*c*c));
        }
    }
}