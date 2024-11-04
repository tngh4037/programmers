class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        int target1 = num_list[num_list.length - 1];
        int target2 = num_list[num_list.length - 2];
        
        int result = target1 - target2;
        int lastValue = result > 0 ? result : target1 * 2;
        
        for  (int i = 0; i < num_list.length + 1; i++) {
            if (i == num_list.length) {
                answer[i] = lastValue;
                break;
            }
            
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}