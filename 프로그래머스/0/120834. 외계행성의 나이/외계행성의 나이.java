import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {

        String strAge = String.valueOf(age);

        return Arrays.stream(strAge.split(""))
            .map(s -> String.valueOf((char)(Integer.parseInt(s) + 97)))
            .collect(Collectors.joining());   
    }
}