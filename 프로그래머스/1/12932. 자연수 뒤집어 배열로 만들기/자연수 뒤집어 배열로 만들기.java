class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
    
        str = sb.toString();

        return str.chars().map(s -> s - '0').toArray();
    }
}