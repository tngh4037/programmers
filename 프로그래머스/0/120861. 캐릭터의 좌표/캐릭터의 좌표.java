class Solution {
    public int[] solution(String[] keyinput, int[] board) {

        int horizent = 0;
        int vertical = 0;
        for (String key: keyinput) {
            if (key.equals("left")) {
                horizent--;
            } else if(key.equals("right")) {
                horizent++;
            } else if(key.equals("up")) {
                vertical++;
            } else if(key.equals("down")) {
                vertical--;
            }
            
                    
        int horizent_length = board[0] / 2;
        if (Math.abs(horizent) > horizent_length) {
            if (horizent < 0) {
                horizent = (-1) * horizent_length;
            } else {
                horizent = horizent_length;
            }
        }
        
        int vertical_length = board[1] / 2;
        if (Math.abs(vertical) > vertical_length) {
            if (vertical < 0) {
                vertical = (-1) * vertical_length;
            } else {
                vertical = vertical_length;
            }
        }
        }

        
        return new int[]{horizent, vertical};
    }
}