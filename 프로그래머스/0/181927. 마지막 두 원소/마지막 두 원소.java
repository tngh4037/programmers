import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        int endElement = num_list[num_list.length - 1];
        int beforeEndElement = num_list[num_list.length - 2];
        
        int newElement;
        if (endElement > beforeEndElement) {
            newElement = endElement - beforeEndElement;
        } else {
            newElement = endElement * 2;
        }
        
        List<Integer> arrs = new ArrayList<>();
        Arrays.stream(num_list).forEach(arrs::add);
        arrs.add(newElement);

        return arrs.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}