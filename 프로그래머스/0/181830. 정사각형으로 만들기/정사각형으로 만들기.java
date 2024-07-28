class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer;
        
        int rowCount = arr.length;
        int columnCount = arr[0].length;
        if (rowCount >= columnCount) {
            answer = new int[rowCount][rowCount];
        } else {
            answer = new int[columnCount][columnCount];
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}