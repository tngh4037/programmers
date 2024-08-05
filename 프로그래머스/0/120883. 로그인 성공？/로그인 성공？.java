class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for (String[] users: db) {
            String userId = users[0];
            String pwd = users[1];
            
            if (userId.equals(id_pw[0]) && pwd.equals(id_pw[1])) {
                return "login";
            }
            
            if (userId.equals(id_pw[0]) && !pwd.equals(id_pw[1])) {
                return "wrong pw";
            }
        }
        
        return "fail";
    }
}