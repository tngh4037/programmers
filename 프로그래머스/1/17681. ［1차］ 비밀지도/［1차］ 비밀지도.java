import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] map1 = new String[n];
        for (int i = 0; i < arr1.length; i++) {
            String str = String.format("%" + n + "s", Integer.toBinaryString(arr1[i]));
            str = str.replace(" ", "0");
            map1[i] = str;
        }

       String[] map2 = new String[n];
        for (int i = 0; i < arr2.length; i++) {
            String str = String.format("%" + n + "s", Integer.toBinaryString(arr2[i]));
            str = str.replace(" ", "0");
            map2[i] = str;
        }
        
        String[] answer = new String[n];
        Arrays.fill(answer, "");
        for (int i = 0; i < n; i++) {
            String[] map1_arr = map1[i].split("");
            String[] map2_arr = map2[i].split("");
            
            for (int j = 0; j < n; j++) {
                if (map1_arr[j].equals("0") && map2_arr[j].equals("0")) {
                    answer[i] += " ";
                } else {
                    answer[i] += "#";
                }
            }
        }
        
        return answer;
    }
}