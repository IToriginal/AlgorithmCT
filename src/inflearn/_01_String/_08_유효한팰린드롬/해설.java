package inflearn._01_String._08_유효한팰린드롬;

import java.io.*;

public class 해설 {
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) throws IOException {
        해설 T = new 해설();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); // found7, time: study; Yduts; emit, 7Dnuof
        System.out.println(T.solution(input)); // YES
    }
}
