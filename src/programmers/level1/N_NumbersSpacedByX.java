package programmers.level1;

/**
 * 2023. 07. 21 (금)
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12954?language=java">x만큼 간격이 있는 n개의 숫자</a>
 */
import java.util.*;

public class N_NumbersSpacedByX {
    public List solution(int x, int n) {
        List<Long> answer = new ArrayList<>();

        for (long i = 1; i <= n; i++) {
            answer.add(i * x);
        }

        return answer;
    }

    public static void main(String[] args) {
        N_NumbersSpacedByX result = new N_NumbersSpacedByX();
        System.out.println(result.solution(2, 5));
        System.out.println(result.solution(4, 3));
        System.out.println(result.solution(-4, 2));
    }
}
