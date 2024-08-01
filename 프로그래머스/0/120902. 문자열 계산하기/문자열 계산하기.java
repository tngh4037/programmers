class Solution {
    public int solution(String my_string) {
        String[] strs = my_string.split(" ");
        int num = Integer.parseInt(strs[0]);
        
        for (int i = 1; i < strs.length; i++) {
            if (i % 2 != 0) {
                if (strs[i].equals("+")) {
                    num += Integer.parseInt(strs[i+1]);
                } else {
                    num -= Integer.parseInt(strs[i+1]);
                }
            }
        }

        return num;
    } 
}