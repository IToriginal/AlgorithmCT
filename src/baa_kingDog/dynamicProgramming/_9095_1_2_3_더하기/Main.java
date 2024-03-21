package baa_kingDog.dynamicProgramming._9095_1_2_3_더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int T;
    static Integer[] dp = new Integer[11];
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            result.append(initDP(N)).append("\n");
        }
        System.out.println(result);
    }

    private static int initDP(int N) {
        if (dp[N] == null) {
            dp[N] = initDP(N - 3) + initDP(N - 2) + initDP(N - 1);
        }
        return dp[N];
    }

}
