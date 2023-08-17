package inflearn._01_String._03_문장속단어;

import java.io.*;

public class 해설 {
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > max) answer = str;

        /*
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > max) {
                max = len;
                answer = x;
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
