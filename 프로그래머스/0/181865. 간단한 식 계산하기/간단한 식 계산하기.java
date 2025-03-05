class Solution {
    public int solution(String binomial) {
        String[] binomials = binomial.split(" ");
        String operator = binomials[1];
        
        if (operator.equals("+")) {
            return Integer.parseInt(binomials[0]) + Integer.parseInt(binomials[2]);
        } else if (operator.equals("-")) {
            return Integer.parseInt(binomials[0]) - Integer.parseInt(binomials[2]);
        } else {
            return Integer.parseInt(binomials[0]) * Integer.parseInt(binomials[2]);
        }
    }
}