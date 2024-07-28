class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = new String[]{"aya", "ye", "woo", "ma"};
        for (String target: babbling) {
            String str = "";
            
            for (int i = 0; i < words.length; i++) {
                for (String word: words) {
                    if (target.indexOf(word) == 0) {
                        target = target.replace(word, "");
                    }
                }
            }
            
            if (target.equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}