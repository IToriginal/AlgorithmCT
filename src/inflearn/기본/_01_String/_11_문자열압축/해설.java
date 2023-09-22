package inflearn.기본._01_String._11_문자열압축;

import java.io.*;

public class 해설 {
    public String solution(String str) {
        String answer = "";
        str = str + " ";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) cnt++;
            else {
                answer += str.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        해설 T = new 해설();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); // KKHSSSSSSSE
        System.out.println(T.solution(input)); // K2HS7E
    }
}
