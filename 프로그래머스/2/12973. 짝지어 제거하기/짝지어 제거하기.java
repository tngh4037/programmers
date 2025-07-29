import java.util.Deque;
import java.util.ArrayDeque;

class Solution
{
    public int solution(String s)
    {
        Deque<String> answer = new ArrayDeque<>();
        for (String str: s.split("")) {
            String element = answer.peek();
            if (element == null) {
                answer.push(str);
                continue;
            }
            
            if (element.equals(str)) {
                answer.pop();
            } else {
                answer.push(str);
            }
        }
        
        return answer.size() == 0 ? 1 : 0;
    }
}