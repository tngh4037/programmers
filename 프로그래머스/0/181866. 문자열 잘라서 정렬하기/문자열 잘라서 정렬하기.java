import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] filteredArr = myString.split("x");
        
        return Arrays.stream(filteredArr)
            .map(str -> str.trim())
            .filter(str -> str.length() > 0)
            .sorted()
            .toArray(String[]::new);
    }
}