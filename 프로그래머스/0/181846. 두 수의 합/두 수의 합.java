import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);
        BigInteger result = a1.add(b1);
        
        return result.toString();
    }
}