class Solution {
    public int solution(int n) {
        int count = 1;
        while (true) {
            if (((7*count) / n) >= 1) {
                break;
            }

            count++;
        }
        return count;
    }
}