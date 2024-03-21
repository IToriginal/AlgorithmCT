package baa_kingDog.dynamicProgramming._1463_1로_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        System.out.println(initDp(N));
    }

    private static int initDp(int N) {
        if (dp[N] == null) {
            if (N % 6 == 0) {
                dp[N] = Math.min(Math.min(initDp(N / 2), initDp(N / 3)), initDp(N - 1)) + 1;
            } else if (N % 3 == 0) {
                dp[N] = Math.min(initDp(N / 3), initDp(N - 1)) + 1;
            } else if (N % 2 == 0) {
                dp[N] = Math.min(initDp(N / 2), initDp(N - 1)) + 1;
            } else {
                dp[N] = initDp(N - 1) + 1;
            }
        }
        return dp[N];
    }

}
