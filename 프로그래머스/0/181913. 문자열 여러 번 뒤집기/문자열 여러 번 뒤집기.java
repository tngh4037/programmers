class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        StringBuilder strBuilder = new StringBuilder();
        for (int[] query: queries) {
            int start = query[0];
            int end = query[1];
            
            for (int i = end; i >= start; i--) {
                strBuilder.append(my_string.charAt(i));
            }
            
            my_string = my_string.substring(0, start) + strBuilder.toString() + my_string.substring(end + 1);
            strBuilder = new StringBuilder();
        }
        
        return my_string;
    }
}