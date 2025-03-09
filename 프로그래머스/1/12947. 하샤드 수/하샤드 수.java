class Solution {
    public boolean solution(int x) {
        int sum = ("" + x).chars().map(i -> i - '0').sum();
        return (x % sum == 0) ? true : false;
    }
}