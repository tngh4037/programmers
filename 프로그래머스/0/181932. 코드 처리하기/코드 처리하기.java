class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (!String.valueOf(code.charAt(i)).equals("1")) {
                    if (i % 2 == 0) {
                        sb.append(String.valueOf(code.charAt(i)));
                    }
                } else {
                    mode = 1;
                }
            } else {
                if (!String.valueOf(code.charAt(i)).equals("1")) {
                    if (i % 2 != 0) {
                        sb.append(String.valueOf(code.charAt(i)));
                    }
                } else {
                    mode = 0;
                }
            }
        }
        
        answer = sb.toString();
        
        if (answer.isEmpty()) {
            return "EMPTY";
        }

        return answer;
    }
}