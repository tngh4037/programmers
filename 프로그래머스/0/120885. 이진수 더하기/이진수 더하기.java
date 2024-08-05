class Solution {
    public String solution(String bin1, String bin2) {
        int su1 = Integer.parseInt(bin1, 2);
        int su2 = Integer.parseInt(bin2, 2);
        int sum = su1 + su2;
        
        return Integer.toBinaryString(sum);
    }
}