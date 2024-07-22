class Solution {
    public int solution(String binomial) {
        String[] strArr = binomial.split(" ");
        
        int num1 = Integer.parseInt(strArr[0]);
        int num2 = Integer.parseInt(strArr[2]);
        switch (strArr[1]) {
            case "+":
                return num1 + num2;
            case "-" :
                return num1 - num2;
            case "*":
                return num1 * num2;
            default:
                return 0;
        }
    }
}