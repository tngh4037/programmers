class Solution {
    public int solution(int a, int b) {
        int target1 = Integer.parseInt("" + a + b);
        int target2 = Integer.parseInt("" + b + a);

        return target1 >= target2 ? target1 : target2;
    }
}