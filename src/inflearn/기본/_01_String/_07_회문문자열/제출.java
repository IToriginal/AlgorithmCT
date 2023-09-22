package inflearn.기본._01_String._07_회문문자열;

import java.io.*;

public class 제출 {
    public String solution(String str) {
        StringBuilder transfer = new StringBuilder();
        int leftPointer = 0;
        int rightPointer = str.length() - 1;

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                transfer.append(Character.toUpperCase(x));
            } else {
                transfer.append(x);
            }
        }
        char[] c = transfer.toString().toCharArray();
        while (leftPointer < rightPointer) {
            if (c[leftPointer] != c[rightPointer]) {
                return "NO";
            }
            leftPointer++;
            rightPointer--;
        }
        return "YES";
    }
    public static void main(String[] args) throws IOException {
        제출 T = new 제출();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(T.solution(input));
    }
}
