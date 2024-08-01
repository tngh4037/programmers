import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String[] daysName = new String[]{"FRI","SAT","SUN","MON","TUE","WED","THU"}; 
        LocalDate ld2 = LocalDate.of(2016, a, b);

        int index = 0;
        for (LocalDate ld = LocalDate.of(2016, 1, 1); ld.isBefore(ld2); ld = ld.plusDays(1)) {
            index++;
        }
        
        return daysName[index % 7];
    }
}