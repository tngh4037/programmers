import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] operations) {
        List<Integer> storedValue = new ArrayList<>();
        
        for (String operation: operations) {
            String[] operationArr = operation.split(" ");
            
            String key = operationArr[0];
            String value = operationArr[1];
            
            if (key.equals("D")) {
                if (storedValue.size() == 0) {
                    continue;
                }
                
                storedValue = storedValue.stream().sorted().collect(Collectors.toList());
                
                if (value.equals("1")) {
                    storedValue.remove(storedValue.size() - 1);
                } else {
                    storedValue.remove(0);
                }
            } else {
                storedValue.add(Integer.parseInt(value));
            }
        }
        
        storedValue = storedValue.stream().sorted().collect(Collectors.toList());
        
        return storedValue.size() == 0 ? 
            new int[]{0, 0} : 
            new int[]{storedValue.get(storedValue.size() - 1), storedValue.get(0)};
    }
}