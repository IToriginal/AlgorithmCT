package inflearn.기본._01_String._07_회문문자열;

import java.io.*;

public class 해설 {
    public String solution(String str) {
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) answer = "NO";
        /*
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
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
