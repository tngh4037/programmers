import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> scores = new ArrayList<>();
        for (String[] members: photo) {
            int score = 0;
            
            for (String member: members) {
                int index = -1;
                
                for (int i = 0; i < name.length; i++) {
                    if (name[i].equals(member)) {
                        index = i;
                        break;
                    }
                }
                
                if (index != -1) {
                    score += yearning[index];
                }
            }
            
            scores.add(score);
        }
        
        return scores.stream().mapToInt(Integer::intValue).toArray();
    }
}