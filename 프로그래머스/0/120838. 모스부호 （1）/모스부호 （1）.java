import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] letter_arr = letter.split(" ");
        for (String code: letter_arr) {
            answer += findAlphabet(code);
        }

        return answer;
    }
    
    private String findAlphabet(String code) {
        Map<String, String> codeMap = new HashMap<>();
        codeMap.put(".-", "a");
        codeMap.put("-...", "b");
        codeMap.put("-.-.", "c");
        codeMap.put("-..", "d");
        codeMap.put(".", "e");
        codeMap.put("..-.", "f");
        codeMap.put("--.", "g");
        codeMap.put("....", "h");
        codeMap.put("..", "i");
        codeMap.put(".---", "j");
        codeMap.put("-.-", "k");
        codeMap.put(".-..", "l");
        codeMap.put("--", "m");
        codeMap.put("-.", "n");
        codeMap.put("---", "o");
        codeMap.put(".--.", "p");
        codeMap.put("--.-", "q");
        codeMap.put(".-.", "r");
        codeMap.put("...", "s");
        codeMap.put("-", "t");
        codeMap.put("..-", "u");
        codeMap.put("...-", "v");
        codeMap.put(".--", "w");
        codeMap.put("-..-", "x");
        codeMap.put("-.--", "y");
        codeMap.put("--..", "z");
        return codeMap.get(code);
    }
}