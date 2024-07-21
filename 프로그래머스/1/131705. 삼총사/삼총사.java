class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        int x;
        int y;
        int z;
        for (int i = 0; i < number.length; i++) {
            x = number[i];
            for (int j = i + 1; j < number.length; j++) {
                 y = number[j];
                for (int k = j + 1; k < number.length; k++) {
                    z = number[k];
                    
                    if (x + y + z == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}