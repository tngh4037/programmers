class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        for (String num: num_str.split("")) {
            int su = Integer.parseInt(num);
            answer += su;
        }
        
        return answer;
    }
}