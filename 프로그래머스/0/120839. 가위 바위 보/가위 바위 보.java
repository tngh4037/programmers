import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {

        return Arrays.stream(rsp.split(""))
            .map(s -> getWinRsp(s))
            .collect(Collectors.joining());
    }
    
    private String getWinRsp(String rsp) {
        if (rsp.equals("0")) {
            return "5";
        } else if (rsp.equals("2")) {
            return "0";
        } else {
            return "2";
        }
    }
}