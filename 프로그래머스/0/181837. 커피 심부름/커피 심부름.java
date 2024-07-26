class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (String p_name: order) {
            if (p_name.contains("latte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        
        return answer;
    }
}
