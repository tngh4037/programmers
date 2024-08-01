class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] strs = quiz[i].split(" ");
            
            int su1 = Integer.parseInt(strs[0]);
            int su2 = Integer.parseInt(strs[2]);
            String operation = strs[1];
            int result = Integer.parseInt(strs[4]);
            
            if (operation.equals("+")) {
                if (su1 + su2 == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (su1 - su2 == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}