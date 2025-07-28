class Solution {
    public long solution(long n) {
        long target = (long) Math.sqrt(n);
        
        long orgN = (long) Math.pow(target, 2);
        if (orgN == n) {
            return (long) Math.pow(target+1, 2);
        } else {
            return -1;
        }
    }
}