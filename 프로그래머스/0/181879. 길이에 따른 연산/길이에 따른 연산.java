import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {

        return num_list.length >= 11 ? 
            Arrays.stream(num_list).sum() :
            Arrays.stream(num_list).reduce(1, (su1, su2) -> su1 * su2);
    }
}