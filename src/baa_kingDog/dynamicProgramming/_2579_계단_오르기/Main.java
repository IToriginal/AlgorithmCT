package baa_kingDog.dynamicProgramming._2579_계단_오르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int[] arr;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp = new Integer[N + 1];
        dp[0] = arr[0];
        dp[1] = arr[1];
        if (N >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(initDP(N));
    }

    private static int initDP(int N) {
        if (dp[N] == null) {
            dp[N] = Math.max(initDP(N - 2), initDP(N - 3) + arr[N - 1]) + arr[N];
        }
        return dp[N];
    }

}
