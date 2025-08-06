import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String letter) {

        Map<String, String> stores = new HashMap<>();
        stores.put(".-","a");
        stores.put("-...","b");
        stores.put("-.-.","c");
        stores.put("-..","d");
        stores.put(".","e");
        stores.put("..-.","f");
        stores.put("--.","g");
        stores.put("....","h");
        stores.put("..","i");
        stores.put(".---","j");
        stores.put("-.-","k");
        stores.put(".-..","l");
        stores.put("--","m");
        stores.put("-.","n");
        stores.put("---","o");
        stores.put(".--.","p");
        stores.put("--.-","q");
        stores.put(".-.","r");
        stores.put("...","s");
        stores.put("-","t");
        stores.put("..-","u");
        stores.put("...-","v");
        stores.put(".--","w");
        stores.put("-..-","x");
        stores.put("-.--","y");
        stores.put("--..","z");
        
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (String chr: letter.split(" ")) {
            sb.append(chr);
            
            String findLetter = stores.get(sb.toString());
            System.out.println(findLetter);
            if (findLetter != null) {
                answer.append(findLetter);
                sb = new StringBuilder();
            }
        }
        
        return answer.toString();
    }
}