class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String[] targets = rsp.split("");
        
        for (String target: targets) {
            answer += getWin(target);
        }
        
        return answer;
    }
    
    private String getWin(String target) {
        switch (target) {
            case "2":
                return "0";
            case "0":
                return "5";
            case "5":
                return "2";
            default:
                throw new IllegalArgumentException();
        }
    }
}