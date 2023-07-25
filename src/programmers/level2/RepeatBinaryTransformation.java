package programmers.level2;

import java.util.Arrays;

/**
 * 2023. 07. 25 (화)
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/70129">이진 변환 반복하기</a>
 */
class RepeatBinaryTransformation {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (!s.equals("1")) {
            answer[0]++;
            String replaceWork = s.replaceAll("0", "");
            answer[1] += s.length() - replaceWork.length();
            s = Integer.toBinaryString(replaceWork.length());
        }
        return answer;
    }

    public static void main(String[] args) {
        RepeatBinaryTransformation result = new RepeatBinaryTransformation();
        System.out.println(Arrays.toString(result.solution("110010101001")));
        System.out.println(Arrays.toString(result.solution("01110")));
        System.out.println(Arrays.toString(result.solution("1111111")));
    }
}
