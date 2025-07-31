import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int n, int m) { 
        List<Integer> target1 = IntStream.rangeClosed(1, n)
            .filter(i -> n % i == 0)
            .mapToObj(Integer::valueOf)
            .collect(Collectors.toList());
        
        List<Integer> target2 = IntStream.rangeClosed(1, m)
            .filter(i -> m % i == 0)
            .mapToObj(Integer::valueOf)
            .collect(Collectors.toList());
        
        target1.retainAll(target2);
        
        int result1 = target1.get(target1.size() - 1);
        int result2 = ((n * m) / result1); // 최소공배수 = (두 수의 곱) / (최대공약수)) 
        
        return new int[]{result1, result2};
    }
}