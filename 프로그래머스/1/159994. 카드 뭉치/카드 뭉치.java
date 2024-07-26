class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String goalStr = String.join("", goal);
        StringBuilder sb = new StringBuilder();
        
        int cards1_index = 0;
        int cards2_index = 0;
        for (String str: goal) {

            for (int i = cards1_index; i < cards1.length; i++) {
                if (str.equals(cards1[i])) {
                    sb.append(str);
                    cards1_index++;
                }
                
                break;
            }

            for (int j = cards2_index; j < cards2.length; j++) {
                if (str.equals(cards2[j])) {
                    sb.append(str);
                    cards2_index++;
                }
                
                break;
            }
        }

        return goalStr.equals(sb.toString()) ? "Yes" : "No";
    }
}