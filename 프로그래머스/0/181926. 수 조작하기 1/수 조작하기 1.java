class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for (String str: control.split("")) {
            answer += getResult(str);
        }
        
        return answer;
    }

    private int getResult(String control) {
        switch (control) {
            case "w":
                return 1;
            case "s":
                return -1;
            case "d":
                return 10;
            case "a":
                return -10;
            default:
                throw new IllegalArgumentException("unsupported argument");
        }
    }
}