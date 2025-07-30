class Solution {
    public int solution(String binomial) {
        String[] opers = binomial.split(" ");
        int num1 = Integer.parseInt(opers[0]);
        int num2 = Integer.parseInt(opers[2]);
        
        switch (opers[1]) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            default:
                throw new IllegalArgumentException("unsupported operation");
        }
    }
}