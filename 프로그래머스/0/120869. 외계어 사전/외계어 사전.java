class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String word: dic) {
            boolean isIncluded = true;
            for (String spelling: spell) {
                if (!word.contains(spelling)) {
                    isIncluded = false;
                    break;
                }
            }
            if (isIncluded) {
                return 1;
            }
        }
        
        return 2;
    }
}