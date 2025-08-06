class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int index = 0;
        
        while (true) {
            int result = (int) Math.pow(2, index);
            if (length <= result) {
                break;
            }
            
            index++;
        }
        
        int[] answer = new int[((int) Math.pow(2, index))];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        
        return answer;
    }
}