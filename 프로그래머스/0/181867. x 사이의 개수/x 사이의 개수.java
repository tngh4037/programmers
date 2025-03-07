import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        List<Integer> stores = new ArrayList<>();
        
        int count = 0;
        for (String str : myString.split("")) {
            
            if (str.equals("x")) {
                stores.add(count);    
                count = 0;
                continue;
            }
            
            count++;
        }
        
        stores.add(count);
        
        return stores.stream().mapToInt(Integer::intValue).toArray();
    }
}