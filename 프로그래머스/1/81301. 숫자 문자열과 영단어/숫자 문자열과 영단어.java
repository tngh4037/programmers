class Solution {
    public int solution(String s) {
        String answer = "";
        
        String word = "";
        for (char spel: s.toCharArray()) {
            int code = (int) spel;
            if (code >= 48 && code <= 57) { // 0 ~ 9
                answer += String.valueOf(spel);
            } else {
                word += String.valueOf(spel);
                Integer result = getMatchedNum(word);
                if (result != null) {
                    answer += String.valueOf(result);
                    word = "";
                }
            }
        }
        
        return Integer.parseInt(answer);
    }
    
    
    private Integer getMatchedNum(String word) {
        switch (word) {
            case "zero":
                return 0;
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            default:
                return null;
        }
    }
}

/*
       String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
*/