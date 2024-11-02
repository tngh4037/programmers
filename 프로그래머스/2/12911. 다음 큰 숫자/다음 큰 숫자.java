class Solution {
    public int solution(int n) {
        int n_copy = n;
        String n_str = Integer.toBinaryString(n).replace("0", "");
        while (true) {
            n_copy++;
            
            String str = Integer.toBinaryString(n_copy).replace("0", "");
            if (n_str.length() == str.length()) {
                return n_copy;
            }
        }
    }
}