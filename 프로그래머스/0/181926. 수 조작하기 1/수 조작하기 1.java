class Solution {
    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            char sep = control.charAt(i);
            if (sep == 'w') {
                n = n + 1;
            } else if (sep == 's') {
                n = n - 1;
            } else if (sep == 'd') {
                n = n + 10;
            } else {
                n = n - 10;   
            }
        }
        
        return n;
    }
}