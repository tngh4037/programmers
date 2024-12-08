import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] myStrArr = my_string.split("");
        
        String temp = myStrArr[num1];
        myStrArr[num1] = myStrArr[num2];
        myStrArr[num2] = temp;
        
        return Arrays.stream(myStrArr).collect(Collectors.joining());
    }
}