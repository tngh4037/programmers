class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int index = 0;
        for (boolean result: included) {
            if (result) {
                if (index == 0) {
                    answer += a;
                } else {
                    answer += (a + (d * index));
                }
            }
            index++;
        }
        
        return answer;
    }
}