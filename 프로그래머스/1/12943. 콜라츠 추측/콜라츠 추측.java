class Solution {
    public int solution(int num) {
        if (num == 1) return 0;
        
        int count = 0;
        long su = num;
        while (su != 1) {
            if (su % 2 == 0) {
                su = su / 2;
            } else {
                su = ((su * 3) + 1);
            }
            
            count++;
            
            if (count == 500) {
                return -1;
            }
        }

        return count;
    }
}