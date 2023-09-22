package inflearn.기본._01_String._02_대소문자변환;

import java.io.*;

public class 해설 {
    public String solution(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (x >= 65 && x <= 90) answer += (char)(x + 32);
            else answer += (char)(x - 32);
        }

        /*
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
        */
        return answer;
    }

    public static void main(String[] args) throws IOException {
        해설 T = new 해설();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(T.solution(input));
    }
}
