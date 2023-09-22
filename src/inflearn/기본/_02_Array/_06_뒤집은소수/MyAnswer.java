package inflearn.기본._02_Array._06_뒤집은소수;

import java.io.*;

/**
 * 2023. 08. 19 (토) - 1차 실패,, Runtime Error
 */

public class MyAnswer {
    public boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public String solution(int N, String s) {
        StringBuilder answer = new StringBuilder();
        String[] split = s.split(" ");

        for (int i = 0; i < N; i++) {
            String reverse = new StringBuilder(split[i]).reverse().toString();
            int number = Integer.parseInt(reverse);
            if (isPrime(number)) {
                answer.append(number).append(" ");
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.println(T.solution(N, s));
    }
}