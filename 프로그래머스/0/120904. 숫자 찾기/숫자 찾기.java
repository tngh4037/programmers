class Solution {
    public int solution(int num, int k) {
        String num_str = String.valueOf(num);
        String k_str = String.valueOf(k);
        if (!num_str.contains(k_str)) {
            return -1;
        }
        
        int index = 1;
        for (String temp: num_str.split("")) {
            if (temp.equals(k_str)) {
                return index;
            }
            
            index++;
        }
        
        return index;
    }
}