class Solution {
    public int solution(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        for (int z = i; z <= j; z++) {
            sb.append(z);
        }
        
        String str = sb.toString();
        
        String str2 = str.replace(String.valueOf(k), "");
        
        return str.length() - str2.length();
    }
}