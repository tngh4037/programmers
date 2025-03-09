class Solution {
    public long solution(long n) {
        long result = (long) Math.sqrt(n);
        if (n == (result * result)) {
            return (long) ((result+1) * (result+1));
        } else {
            return -1;
        }
    }
}
