/**
 * 2023. 07. 21 (금)
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12941?language=java">최솟값 만들기</a>
 */
package programmers.level2;

import java.util.Arrays;
import java.util.Collections;

public class CreateMinimum {
    public int solution(int []A, int []B) {
        Integer[] A_reverse = new Integer[A.length];

        for (int i = 0; i < A.length; i++) {
            A_reverse[i] = A[i];
        }

        Arrays.sort(A_reverse, Collections.reverseOrder());
        Arrays.sort(B);

        int answer = 0;

        for (int i = 0; i < B.length; i++) {
            answer += A_reverse[i] * B[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        CreateMinimum result = new CreateMinimum();

        int[] A1 = {1, 4, 2};
        int[] B1 = {5, 4, 4};
        int[] A2 = {1, 2};
        int[] B2 = {3, 4};

        System.out.println(result.solution(A1, B1));
        System.out.println(result.solution(A2, B2));
    }
}
