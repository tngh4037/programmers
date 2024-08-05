class Solution {
    public int[] solution(int[][] score) {       
        int[] sum = new int[score.length];
    
        int index = 0;
        for (int[] num: score) {
            sum[index] = num[0] + num[1];
            index++;
        }
        
        int[] answer = new int[score.length];
        for (int i = 0; i < sum.length; i++) {
             int target = sum[i];
             int rank = 1;
            
             for (int j = 0; j < sum.length; j++) {
                 if (target < sum[j]) {
                     rank++;
                 }
             }
             
             answer[i] = rank;
        }

        return answer;
    }
}