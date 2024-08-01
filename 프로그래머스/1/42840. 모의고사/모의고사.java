import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자1 점수 계산
        int[] typeA = new int[]{1, 2, 3, 4, 5};
        int typeA_score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == typeA[i % 5]) {
                typeA_score++;
            }
        }

        // 수포자2 점수 계산
        int[] typeB = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int typeB_score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == typeB[i % 8]) {
                typeB_score++;
            }
        }

        // 수포자3 점수 계산
        int[] typeC = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int typeC_score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == typeC[i % 10]) {
                typeC_score++;
            }
        }

        // 최대 스코어 조회 및 승자 리턴
        List<Integer> winners = new ArrayList<>();
        int maxValue = Math.max(Math.max(typeA_score, typeB_score), typeC_score);
        if (typeA_score == maxValue) {
            winners.add(1);
        }
        if (typeB_score == maxValue) {
            winners.add(2);
        }
        if (typeC_score == maxValue) {
            winners.add(3);
        }
        
        return winners.stream().mapToInt(Integer::intValue).toArray();
    }
}