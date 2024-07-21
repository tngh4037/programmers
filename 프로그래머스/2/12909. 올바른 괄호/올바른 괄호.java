class Solution {
    boolean solution(String s) {
        int leftCount = 0;
        String[] strArr = s.split("");
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("(")) {
                leftCount++;
            } else {
                leftCount--;
            }
            
            if (leftCount < 0) {
                return false;
            }
        }
        
        if (leftCount != 0) {
            return false;
        }

        return true;
    }
}