package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 2023. 07. 20 (목)
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12939?language=java">최대값과 최솟값</a>
 */
class GetMinAndMaxValue {
    public String solution(String s) {

        List<Integer> arr = new ArrayList<>();
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            arr.add(Integer.parseInt(str[i]));
        }
        return Collections.min(arr) + " " + Collections.max(arr);
    }

    public static void main(String[] args) {
        String s = "1 2 3 4";
        GetMinAndMaxValue result = new GetMinAndMaxValue();
        System.out.println(result.solution(s));
    }
}

