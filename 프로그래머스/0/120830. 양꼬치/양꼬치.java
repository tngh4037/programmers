class Solution {
    public int solution(int n, int k) {
        int freeBeverageCount = n / 10;
        
        k = k - freeBeverageCount;
        
        int totalPrice = (n * 12000) + (k * 2000);
        
        return totalPrice;
    }
}