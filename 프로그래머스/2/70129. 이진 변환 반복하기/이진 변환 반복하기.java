class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        String str = s;
        while (!str.equals("1")) {
            int beforeLength = str.length();
            String removedStr = str.replace("0", "");
            
            str = Integer.toBinaryString(removedStr.length());
            
            answer[0]++;
            answer[1] = answer[1] + (beforeLength - removedStr.length());
        }
        
        return answer;
    }
}
