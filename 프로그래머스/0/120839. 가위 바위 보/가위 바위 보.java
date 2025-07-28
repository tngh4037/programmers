import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
      
        return Arrays.stream(rsp.split(""))
            .map(this::getResult)
            .collect(Collectors.joining());
    }
    
    private String getResult(String rsp) {
        switch(rsp) {
            case "0":
                return "5";
            case "2":
                return "0";
            case "5":
                return "2";
            default:
                throw new IllegalArgumentException("unsupported rsp");
        }
    }
}