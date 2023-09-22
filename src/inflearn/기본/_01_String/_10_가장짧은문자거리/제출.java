package inflearn.기본._01_String._10_가장짧은문자거리;

import java.io.*;

public class 제출 {
    public String solution(String str, char t) {
        String answer = "";
        int len = str.length();
        int[] position = new int[len];

        int pos = 100;
        for (int i = 0; i < len; i++) {
            if (t == str.charAt(i)) {
                pos = 0;
            }
            position[i] = pos;
            pos++;
        }

        pos = 100;
        for (int i = len - 1; i >= 0; i--) {
            if (t == str.charAt(i)) {
                pos = 0;
            }
            position[i] = Math.min(position[i], pos);
            pos++;
        }

        for (int i = 0; i < len; i++) {
            answer += position[i] + " ";
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        제출 T = new 제출();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" "); // teachermode e
        String str = input[0];
        char t = input[1].charAt(0);
        System.out.println(T.solution(str, t));
    }
}