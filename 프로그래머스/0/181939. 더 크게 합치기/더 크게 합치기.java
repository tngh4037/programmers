class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int target1 = Integer.parseInt(String.valueOf(a).concat(String.valueOf(b)));
        int target2 = Integer.parseInt(String.valueOf(b).concat(String.valueOf(a)));

        return (int) Math.max(target1, target2);
    }
}