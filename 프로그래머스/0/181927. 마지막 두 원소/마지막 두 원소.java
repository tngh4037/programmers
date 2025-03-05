import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        
        int last_num = num_list[num_list.length-1];
        int last_second_num = num_list[num_list.length-2];
        
        answer[answer.length-1] = last_num > last_second_num ? last_num - last_second_num : last_num * 2;

        return answer;
    }
}