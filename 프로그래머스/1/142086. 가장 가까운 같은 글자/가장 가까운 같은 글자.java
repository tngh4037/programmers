class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        String temp = "";
        String[] strArr = s.split("");
        for (int i = 0; i < strArr.length; i++) {
            int index = temp.lastIndexOf(strArr[i]);
            if (index != -1) {
                index = i - index;
            }
        
            temp += strArr[i];
            answer[i] = index;
        }
        
        return answer;
    }
}