class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        System.arraycopy(num_list, 0, answer, answer.length - n, n);
        System.arraycopy(num_list, n, answer, 0, num_list.length - n);

        return answer;
    }
}