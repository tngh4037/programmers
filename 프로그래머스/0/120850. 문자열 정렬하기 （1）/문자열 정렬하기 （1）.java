import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {

        return my_string.chars()
            .filter(Character::isDigit)
            .map(i -> i - '0')
            .sorted()
            .toArray();
    }
}