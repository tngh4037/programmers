import java.util.stream.IntStream;

class Solution {
    public int solution(String myString, String pat) {

        return (int) IntStream.rangeClosed(0, myString.length() - pat.length())
            .filter(i -> myString.substring(i, pat.length() + i).equals(pat))
            .count();
    }
}