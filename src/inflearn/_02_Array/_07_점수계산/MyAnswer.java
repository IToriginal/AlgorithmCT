package inflearn._02_Array._07_점수계산;

import java.io.*;

public class MyAnswer {
    public int solution(int N, String s) {
        int answer = 0;
        int score = 0;
        String[] arr = s.split(" ");

        for (String x : arr) {
            if (x.equals("1")) {
                score++;
                answer += score;
            } else {
                score = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int N = Integer.parseInt(br.readLine());
        // String s = br.readLine();
        int N = 10;
        String s = "1 0 1 1 1 0 0 1 1 0";
        System.out.println(T.solution(N, s));
    }
}
