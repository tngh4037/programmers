class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        int target = direction.equals("right") ? numbers[numbers.length-1] : numbers[0];

        System.arraycopy(numbers, 
                          (direction.equals("right") ? 0 : 1), 
                          answer, 
                          (direction.equals("right") ? 1 : 0), 
                          numbers.length - 1
                         );
        
        if (direction.equals("right")) {
            answer[0] = target;
        } else {
            answer[answer.length-1] = target;
        }
            
        return answer;
    }
}