class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) {
                sb.append(String.valueOf(my_string.charAt(num2)));
                continue;
            }
            if (i == num2) {
                sb.append(String.valueOf(my_string.charAt(num1)));
                continue;
            }
            
            sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
}