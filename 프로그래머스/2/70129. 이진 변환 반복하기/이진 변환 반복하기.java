class Solution {
    public int[] solution(String s) {
        String temp = s;
        int count = 0;
        int removeSum = 0;

        while (true) {
            count++;
            String replaceStr = temp.replace("0", "");
            removeSum += (temp.length() - replaceStr.length());
        
            if (replaceStr.equals("1")) {
                break;
            }
            
            temp = Integer.toBinaryString(replaceStr.length());
        }
        
        return new int[]{count, removeSum};
    }
}