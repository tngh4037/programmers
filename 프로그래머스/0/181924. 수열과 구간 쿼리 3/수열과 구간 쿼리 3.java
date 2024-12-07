class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        for (int[] query: queries) {
            int target1 = query[0]; 
            int target2 = query[1]; 
            
            int temp = arr[target1];
            arr[target1] = arr[target2];
            arr[target2] = temp;
        }
        
        return arr;
    }
}