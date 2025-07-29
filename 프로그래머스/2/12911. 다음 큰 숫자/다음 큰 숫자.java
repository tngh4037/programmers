class Solution {
    public int solution(int n) {
        int orgBinaryCount = Integer.toString(n, 2).replace("0", "").length();
        int nextValue = n+1;
        while (true) {
            int nextValueBinaryCount = Integer.toString(nextValue, 2).replace("0", "").length();
            if (orgBinaryCount == nextValueBinaryCount) {
                return nextValue;
            }
            
            nextValue++;
        }
    }
}