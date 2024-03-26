package baa_kingDog.dynamicProgramming._1699_제곱수의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new Integer[N + 1];
        dp[0] = 0;
        dp[1] = 1;
        System.out.println(solution(N));
    }

    private static int solution(int N) {
        for (int i = 2; i <= N; i++) {
            int min = Integer.MAX_VALUE;
            int j = 1;
            while (i - j * j >= 0) {
                min = Math.min(min, dp[i - j * j] + 1);
                j++;
            }
            dp[i] = min;
        }
        return dp[N];
    }

}
