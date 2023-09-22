package inflearn.기본._01_String._08_유효한팰린드롬;
/**
 * 2023. 08. 18 (금) - 1차 실패,, 정규식을 생각 못하면서 실패.
 */

import java.io.*;

public class 제출 {
    public String solution(String str) {
        String answer = "YES";
        str = str.replaceAll("[^a-zA-Z]", "");
        String reverse = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(reverse)) answer = "NO";
        return answer;
    }

    public static void main(String[] args) throws IOException {
        제출 T = new 제출();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); // found7, time: study; Yduts; emit, 7Dnuof
        System.out.println(T.solution(input)); // YES
    }
}
