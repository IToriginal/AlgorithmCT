package inflearn._02_Array._05_소수_에라토스테네스체;

import java.io.*;

public class MyAnswer {
    public boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public int solution(int N) {
        int answer = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) answer++;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(T.solution(N));

    }
}
