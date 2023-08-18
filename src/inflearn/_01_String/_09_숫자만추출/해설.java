package inflearn._01_String._09_숫자만추출;

import java.io.*;

public class 해설 {
    public int solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) // x 가 숫자인지를 판단함. 숫자이면?
                answer += x; // answer에 추가
            /*
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
             */
        }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args) throws IOException {
        해설 T = new 해설();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(T.solution(input));
    }
}
