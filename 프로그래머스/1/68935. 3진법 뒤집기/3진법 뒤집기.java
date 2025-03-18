class Solution {
    public int solution(int n) {
        String str = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
 
        return Integer.parseInt(sb.toString(), 3);
    }
}

