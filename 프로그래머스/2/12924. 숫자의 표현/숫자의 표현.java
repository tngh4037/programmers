class Solution {
    public int solution(int n) {
        int answer = 0;

        int sum = 0;
        int index = 1;
        while (index <= n) {
            
            for (int i = index; i <= n; i++) {
                sum += i;

                if (sum == n) {
                    answer++;
                    break;
                }

                if (sum > n) {
                    break;
                }
            }
            
            sum = 0;
            index++;
        }

        return answer;
    }
}