class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        // System.arraycopy(뭐를, 몇번째부터, 어디에, 어디서부터, 몇개를 복사해서 넣을건지)
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer[answer.length - 1] = 
                num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            answer[answer.length - 1] = num_list[num_list.length - 1] * 2;
        }

        return answer;
    }
}