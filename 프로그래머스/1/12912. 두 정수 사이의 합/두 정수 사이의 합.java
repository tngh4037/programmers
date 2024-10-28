import java.util.stream.LongStream;

class Solution {
    public long solution(int a, int b) {
        if (a == b) {
            return a;
        }
        
        int start = a < b ? a : b;
        int end = a > b ? a : b;
        
        return LongStream.rangeClosed(start, end).sum();
    }
}