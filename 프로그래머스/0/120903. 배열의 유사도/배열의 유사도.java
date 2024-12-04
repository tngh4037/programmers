import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        String[] addedArr = new String[s1.length + s2.length];
        for (int i = 0; i < s1.length; i++) {
            addedArr[i] = s1[i];
        }
        for (int i = 0; i < s2.length; i++) {
            addedArr[s1.length + i] = s2[i];
        }
        
        int distinctCount = (int) Arrays.stream(addedArr).distinct().count();
        
        return addedArr.length - distinctCount;
    }
}