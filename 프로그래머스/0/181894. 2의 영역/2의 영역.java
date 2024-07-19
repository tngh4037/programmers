import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int totalCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                totalCount++;
            }
        }
        
        if (totalCount < 1) {
            return new int[]{-1};
        }
        
        List<Integer> nums = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count++;
            }
            
            if (count > 0) {
                nums.add(arr[i]);
            }
            
            if (count == totalCount) {
                break;
            }
        }
        
        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
}

/*
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return list.contains(2) ? list.subList(list.indexOf(2), list.lastIndexOf(2) + 1) : Arrays.asList(-1);
    }
}
*/