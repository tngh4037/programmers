import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, String alp) {
       
        return my_string.replace(alp, alp.toUpperCase());
    }
}