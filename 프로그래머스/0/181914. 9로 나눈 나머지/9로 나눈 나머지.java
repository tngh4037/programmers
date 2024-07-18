class Solution {
    public int solution(String number) {
        int sum = 0;
        for (char num: number.toCharArray()) {
            sum += Integer.parseInt(Character.toString(num));
        }
        
        return sum % 9;
    }
}