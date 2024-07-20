class Solution {
    public int solution(int[] arr) {
        int[] temp = new int[arr.length];
        
        int index = 0;
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];

                if (temp[i] >= 50) {
                    if (temp[i] % 2 == 0) {
                        temp[i] = temp[i] / 2;
                    }
                } else {
                    if (temp[i] % 2 != 0) {
                        temp[i] = (temp[i] * 2) + 1;
                    }
                }
            }

            if (isSame(arr, temp)) {
                return index;
            }
            
            index++;
            arr = temp.clone();
        }
    }
    
    private boolean isSame(int[] arr, int[] temp) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == temp[i]) {
                count++;
            }
        }
        
        return arr.length == count;
    }
}