import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int memberDays = IntStream.of(number).sum();
        String wantProducts = makeWantProducts(want, number);
        
        int answer = 0;
        int index = 0;
        while (true) {
            List<String> discountTarget = new ArrayList<>();
            
            for (int i = index; i < index + memberDays; i++) {
                try {
                    discountTarget.add(discount[i]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    return answer;
                }
            }
            
            String discountProducts = discountTarget.stream().sorted().collect(Collectors.joining());
            if (wantProducts.equals(discountProducts)) {
                answer++;
            }
            
            index++;
        }
    }
    
    private String makeWantProducts(String[] want, int[] number) {
        List<String> target = new ArrayList<>();
        
        for (int n = 0; n < want.length; n++) {
            String w_name = want[n];
            for (int m = 0; m < number[n]; m++) {
                target.add(w_name);
            }
        }
        
        return target.stream().sorted().collect(Collectors.joining());
    }
}