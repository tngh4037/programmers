class Solution {
    public int solution(String s) {
        if (s.length() < 2 || s.length() % 2 != 0) {
            return 0;
        }
        
        int answer = 0;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            String temp = s;
            
            while (index <= (s.length() / 2)) {
                temp = temp.replace("()", "").replace("{}", "").replace("[]", "");
                index++;
            }
            
            if (temp.length() == 0) {
                answer++;
            }
            
            s = s.substring(1) + s.substring(0, 1);
            index = 0;
        }
        
        return answer;
    }
}