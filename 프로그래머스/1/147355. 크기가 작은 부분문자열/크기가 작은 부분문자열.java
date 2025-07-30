import java.util.stream.IntStream;

class Solution {
    public int solution(String t, String p) {
        long intP = new Long(p);
        
        return (int) IntStream.range(0, t.length() - p.length() + 1)
            .filter(i -> new Long(t.substring(i, i + p.length())) <= intP)
            .count();
    }
}