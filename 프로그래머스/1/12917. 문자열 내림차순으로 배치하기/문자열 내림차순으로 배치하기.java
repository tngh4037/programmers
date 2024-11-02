import java.util.stream.*;

class Solution {
    public String solution(String s) {
        
        String upperString = s.chars()
            .filter(c -> c >= 'A' && c <= 'Z')
            .sorted()
            .mapToObj(c -> String.valueOf((char) c))
            .collect(Collectors.joining());
        
        String lowerString = s.chars()
            .filter(c -> c >= 'a' && c <= 'z')
            .sorted()
            .mapToObj(c -> String.valueOf((char) c))
            .collect(Collectors.joining());
        
        return new StringBuilder(lowerString).reverse().toString() + 
            new StringBuilder(upperString).reverse().toString();
    }
}