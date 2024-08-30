import java.util.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
        List<Integer> candidates = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            candidates.add(i);
        }

        int round = 1;
        List<Integer> temp = new ArrayList<>();
        while (true) {
            
            for (int i = 0; i < candidates.size(); i++) {
                boolean match = false;
                
                if (candidates.get(i) == a || candidates.get(i) == b) {
                    match = true;
                }
                
                if (i % 2 != 0) {
                    if (match) {
                        int beforeValue = temp.get(temp.size() - 1);
                        if (beforeValue == a || beforeValue == b) {
                            return round;
                        }
                        
                        temp.remove(temp.size() - 1);
                        temp.add(candidates.get(i));
                    }
                    
                    continue;
                }
                
                temp.add(candidates.get(i));
            }
            
            candidates = temp;
            
            temp = new ArrayList<>(); 
            
            round++;
        }

    }
}