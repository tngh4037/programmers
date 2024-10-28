class Solution {
    public int solution(int n, int k) {
        int serviceCount = n / 10;
        
        k -= serviceCount;

        return (n * 12000) + (k * 2000);
    }
}