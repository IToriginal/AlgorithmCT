package inflearn.기본._01_String._02_대소문자변환;

import java.io.*;

public class 제출 {

    public char[] solution(String str) {
        char[] answer = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                answer[i] = Character.toLowerCase(str.charAt(i));
            } else {
                answer[i] = Character.toUpperCase(str.charAt(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        제출 T = new 제출();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(T.solution(input));
    }
}
