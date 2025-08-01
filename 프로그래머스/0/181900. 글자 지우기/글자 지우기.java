import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[] indices) {
        String[] strs = my_string.split("");
        
        for (int indice: indices) {
            strs[indice] = "";
        }
        
        return Arrays.stream(strs).collect(Collectors.joining());
    }
}