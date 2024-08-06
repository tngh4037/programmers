import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        Set<Target> result = new HashSet<>();
        for (int[] line: lines) {
            int start = line[0];
            int end = line[1];
            
            for (int i = start; i < end; i++) {
                Target target = new Target(i, i+1);
                boolean result_add = result.add(target);
                if (!result_add) {
                    result.remove(target);
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    static class Target {
        int start;
        int end;

        public Target(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int hashCode() {
            return this.start;
        }

        @Override
        public boolean equals(Object t) {
            Target t1 = (Target) t;
            return t1.start == this.start && t1.end == this.end;
        }
    }
}