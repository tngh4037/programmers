import java.util.Arrays;

class Solution {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist)
            .mapToInt(v -> v.length())
            .toArray();
    }
}