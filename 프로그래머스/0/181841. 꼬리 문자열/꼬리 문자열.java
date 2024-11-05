import java.util.Arrays;
import java.util.stream.*;
import java.util.function.*;

class Solution {
    public String solution(String[] str_list, String ex) {

        return Arrays.stream(str_list)
            .filter(Predicate.not(str -> str.contains(ex)))
            .collect(Collectors.joining());
    }
}