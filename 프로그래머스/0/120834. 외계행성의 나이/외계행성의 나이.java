import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        char zero = 'a';
        
        return Arrays.stream(String.valueOf(age).split(""))
            .map(str -> String.valueOf((char)(zero + Integer.parseInt(str))))
            .collect(Collectors.joining());
    }
}