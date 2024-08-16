class Solution {
    public int solution(int price) {
        if (price >= 500_000) {
            return (int) (price - ((price / 100.0) * 20));
        } else if (price >= 300_000) {
            return (int) (price - ((price / 100.0) * 10));
        } else if (price >= 100_000) {
            return (int) (price - ((price / 100.0) * 5));
        } else {
            return price;
        }
    }
}