class Solution {
    public int solution(int[] num_list) {
        int totalCount = 0;
        
        for (int num: num_list) {
            int count = 0;
         
            while (true) {
                if (num == 1) {
                    break;
                }
                
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = (num - 1) / 2;
                }
                
                count++;
            }
            
            totalCount += count;
        }
        
        return totalCount;
    }
}