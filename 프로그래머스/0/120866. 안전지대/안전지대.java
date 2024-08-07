import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 1) {
                    drawDangerArea(board, row, col);
                }
            }
        }
        
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 0) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    private void drawDangerArea(int[][] board, int row, int col) {

        if (row - 1 >= 0 && col - 1 >= 0) {
            if (board[row - 1][col - 1] == 0) {
                board[row - 1][col - 1] = 2;
            }
        }
        
        if (row - 1 >= 0) {
            if (board[row - 1][col] == 0) {
                board[row - 1][col] = 2;
            }
        }
        
        if (row - 1 >= 0 && col + 1 < board[0].length) {
            if (board[row - 1][col + 1] == 0) {
                board[row - 1][col + 1] = 2;
            }
        }
        
        if (col - 1 >= 0) {
            if (board[row][col - 1] == 0) {
                board[row][col - 1] = 2;
            }
        }
        
        if (col + 1 < board[0].length) {
            if (board[row][col + 1] == 0) {
                board[row][col + 1] = 2;
            }
        }
        
        if (row + 1 < board.length && col - 1 >= 0) {
            if (board[row + 1][col - 1] == 0) {
                board[row + 1][col - 1] = 2;
            }
        }
        
        if (row + 1 < board.length) {
            if (board[row + 1][col] == 0) {
                board[row + 1][col] = 2;
            }
        }

        if (row + 1 < board.length && col + 1 < board[0].length) {
            if (board[row + 1][col + 1] == 0) {
                board[row + 1][col + 1] = 2;
            }
        }
    }
}