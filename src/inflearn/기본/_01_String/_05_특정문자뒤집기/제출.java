package inflearn.기본._01_String._05_특정문자뒤집기;

import java.io.*;

public class 제출 {
    public String solution(String str) {
        char[] x = str.toCharArray();
        int leftPointer = 0;
        int rightPointer = str.length() - 1;

        while (leftPointer < rightPointer) {
            boolean leftPointCaseCheck = (
                Character.isLowerCase(x[leftPointer]) || Character.isUpperCase(x[leftPointer])
            );

            boolean rightPointCaseCheck = (
                Character.isLowerCase(x[rightPointer]) || Character.isUpperCase(x[rightPointer])
            );

            if (!leftPointCaseCheck) leftPointer++;
            if (!rightPointCaseCheck) rightPointer--;
            if (leftPointCaseCheck && rightPointCaseCheck) {
                char tmp = x[leftPointer];
                x[leftPointer] = x[rightPointer];
                x[rightPointer] = tmp;
                leftPointer++;
                rightPointer--;
            }
        }
        return String.valueOf(x);
    }

    public static void main(String[] args) throws IOException {
        제출 T = new 제출();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(T.solution(input));
    }
}
