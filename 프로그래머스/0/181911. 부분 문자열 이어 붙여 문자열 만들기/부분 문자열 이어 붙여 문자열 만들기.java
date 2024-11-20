import java.util.Arrays;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {

        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int[] part : parts) {
            sb.append(my_strings[index].substring(part[0], part[1] + 1));
            index++;
        }
        
        return sb.toString();
    }
}