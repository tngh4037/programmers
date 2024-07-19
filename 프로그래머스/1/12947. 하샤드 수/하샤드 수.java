class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        String[] strs = str.split("");
        
        int sum = 0;
        for (String su: strs) {
            sum += Integer.parseInt(su);
        }
        
        return x % sum == 0 ? true : false;
    }
}