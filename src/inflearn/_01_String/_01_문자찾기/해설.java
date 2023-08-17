package inflearn._01_String._01_문자찾기;

import java.io.*;

public class 해설 {
    public int solution(String str, char t) { // Programmers
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }
        /*
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                answer++;
            }
        }
         */

        return answer;
    }

    public static void main(String[] args) throws IOException { // BOJ
        해설 T = new 해설();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        char inputFindAlphabet = br.readLine().charAt(0);
        System.out.println(T.solution(inputString, inputFindAlphabet));
    }
}
