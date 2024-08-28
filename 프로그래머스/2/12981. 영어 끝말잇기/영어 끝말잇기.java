import java.util.*;

class Solution {
    List<String> wordList = new ArrayList<>();
    
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        
        int index = 1;
        for (int i = 0; i < words.length; i++) {
            boolean result = isValidWord(words[i]);
            
            if ((i+1) > (n * index)) {
                index++;
            }
            
            if (!result) {
                return new int[]{((i+1) - (n * (index - 1))), index};
            }
            
            wordList.add(words[i]);
        }

        return new int[]{0, 0};
    }
    
    private boolean isValidWord(String word) {
        if (wordList.size() > 0) {
            if (wordList.contains(word)) {
                return false;
            }
            
            String beforeWord = wordList.get(wordList.size() - 1);
            
            char word1 = beforeWord.charAt(beforeWord.length() - 1);
            char word2 = word.charAt(0);
            
            return String.valueOf(word1).equals(String.valueOf(word2));
        }
        
        return true;
    }
}