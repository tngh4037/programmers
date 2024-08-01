class Solution {
    public int solution(int num, int k) {
        String num_str = String.valueOf(num);
        String k_str = String.valueOf(k);
        
        int answer = num_str.indexOf(k_str);
        return answer == -1 ? -1 : answer + 1;
    }
}