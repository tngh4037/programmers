import java.util.*;

class Solution {
    public String solution(String a, String b) {
        String[] as = a.split("");
        String[] bs = b.split("");
        
        int diff_length = 0;
        if (bs.length > as.length) {
            diff_length = bs.length - as.length;
            
            String[] strs = new String[bs.length];
            for (int i = 0; i < diff_length; i++) {
                strs[i] = "0";
            }
            
            for (int i = 0; i < as.length; i++) {
                strs[i + diff_length] = as[i];
            }
            
            as = strs;
        } else if (as.length > bs.length) {
            diff_length = as.length - bs.length;
            
            String[] strs = new String[as.length];
            for (int i = 0; i < diff_length; i++) {
                strs[i] = "0";
            }
            
            for (int i = 0; i < bs.length; i++) {
                strs[i + diff_length] = bs[i];
            }
            
            bs = strs;
        }

        int temp = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = as.length-1; i >= 0; i--) {
            int sum = Integer.parseInt(as[i]) + Integer.parseInt(bs[i]) + temp;
            String str = "";
            if (sum > 9) {
                temp = 1;
                str = String.valueOf(sum).substring(1, 2);
            } else {
                temp = 0;
                str = String.valueOf(sum);
            }

            sb.append(str);
        }

        if (temp > 0) {
            sb.append("1");
        }
        
        return sb.reverse().toString();
    }
}

/*
        import java.math.BigInteger;
        
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);
        
        String answer = sum.toString();
        
        return answer;
*/