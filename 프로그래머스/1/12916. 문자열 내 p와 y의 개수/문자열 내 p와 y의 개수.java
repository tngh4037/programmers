import java.util.*;

class Solution {
    boolean solution(String s) {
        String[] strArr = s.split("");
        int pCount = (int) Arrays.stream(strArr).filter(str -> str.equals("p") || str.equals("P")).count();
        int yCount = (int) Arrays.stream(strArr).filter(str -> str.equals("y") || str.equals("Y")).count();

        return pCount != yCount ? false : true;
    }
}