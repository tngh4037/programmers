class Solution {
    public int solution(int n) {
        int num = 0;
        
        for (int i = 1; i <= n; i++) {

            while (true) {
                String str = String.valueOf(num+1);
                
                if (str.contains("3") || (num+1) % 3 == 0) {
                    num++;
                } else {
                    break;
                }
            }
           
            num++;
        }
        
        return num;
    }
}