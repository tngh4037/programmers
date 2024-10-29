import java.util.stream.*;

class Solution {
    public String solution(String rsp) {
        return rsp.chars().mapToObj(c -> {
                if (c == '2') {
                    return '0';
                } else if (c == '0') {
                    return '5';
                } else {
                    return '2';
                }
            })
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}

// 가위는 2 바위는 0 보는 5로 표현합니다.