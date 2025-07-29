import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(0);
        answer.add(1);
        while ((answer.size()-1) != n) {
            answer.add((answer.get(answer.size() - 2) + answer.get(answer.size() - 1)) % 1234567);
        }
        
        return answer.get(answer.size() - 1) % 1234567;
    }
}


