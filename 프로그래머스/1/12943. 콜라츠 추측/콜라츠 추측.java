class Solution {
    public int solution(int num) {
        if (num == 1) {
            return 0;
        }
        
        int loop = 0;
        long su = num;
        while(true) {
            if (su % 2 == 0) {
                su = su / 2;
            } else {
                su = (su * 3) + 1;
            }
            
            loop++;
            
            if (su == 1) {
                break;
            }
            
            if (loop == 500) {
                break;
            }
        }

        if (su != 1) {
            return -1;
        }

        return loop;
    }
}