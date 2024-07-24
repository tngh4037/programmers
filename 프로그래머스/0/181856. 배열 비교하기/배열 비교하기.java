class Solution {
    public int solution(int[] arr1, int[] arr2) {
        // length check
        int arrs1_length = arr1.length;
        int arrs2_length = arr2.length;
        if (arrs1_length < arrs2_length) {
            return -1;
        } else if (arrs1_length > arrs2_length) {
            return 1;
        }
        
        // sum check
        int arrs1_sum = 0;
        int arrs2_sum = 0;
        for (int i = 0; i < arrs1_length; i++) {
            arrs1_sum += arr1[i];
            arrs2_sum += arr2[i];
        }
        
        return arrs1_sum > arrs2_sum ? 1 : (arrs1_sum < arrs2_sum ? -1 : 0);
    }
}