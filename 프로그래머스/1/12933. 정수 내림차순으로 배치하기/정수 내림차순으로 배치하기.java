import java.util.*;
import java.util.stream.*;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        
        str = Arrays.stream(str.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        
        return Long.parseLong(str);
    }
}