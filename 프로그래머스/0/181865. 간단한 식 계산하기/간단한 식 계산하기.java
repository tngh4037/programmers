class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] q = binomial.split(" ");
        String op = q[1];
        
        if (op.equals("+")) {
            return Integer.parseInt(q[0]) + Integer.parseInt(q[2]);
        } else if (op.equals("-")) {
            return Integer.parseInt(q[0]) - Integer.parseInt(q[2]);
        } else if (op.equals("*")) {
            return Integer.parseInt(q[0]) * Integer.parseInt(q[2]);
        } 
        
        return answer;
    }
}