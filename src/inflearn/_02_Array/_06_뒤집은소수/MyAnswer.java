package inflearn._02_Array._06_뒤집은소수;

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
        String answer = "";
        String reverse = new StringBuilder(s).reverse().toString();
        String[] split = reverse.split(" ");

        int[] numbers = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            numbers[i] = Integer.parseInt(split[i]);
            if (isPrime(numbers[i])) {
                answer += numbers[i] + " ";
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.println(T.solution(N, s));
    }
}