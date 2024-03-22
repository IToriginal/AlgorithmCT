package baa_kingDog.dynamicProgramming._1149_RGB거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int[][] cost;
    static int RED_COLOR = 0, GREEN_COLOR = 1, BLUE_COLOR = 2;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        cost = new int[N][3];
        for (int i = 0; i < N; i++) {
            String[] costInfo = br.readLine().split(" ");
            cost[i][RED_COLOR] = Integer.parseInt(costInfo[0]);
            cost[i][GREEN_COLOR] = Integer.parseInt(costInfo[1]);
            cost[i][BLUE_COLOR] = Integer.parseInt(costInfo[2]);
        }

        dp = new Integer[N][3];
        dp[0][RED_COLOR] = cost[0][RED_COLOR];
        dp[0][GREEN_COLOR] = cost[0][GREEN_COLOR];
        dp[0][BLUE_COLOR] = cost[0][BLUE_COLOR];

        int result = Math.min(initDP(N - 1, RED_COLOR),
                Math.min(initDP(N - 1, GREEN_COLOR), initDP(N - 1, BLUE_COLOR)));
        System.out.println(result);
    }

    private static int initDP(int N, int color) {
        if (dp[N][color] == null) {
            if (color == RED_COLOR) {
                dp[N][RED_COLOR] = Math.min(initDP(N - 1, GREEN_COLOR), initDP(N - 1, BLUE_COLOR))
                        + cost[N][RED_COLOR];
            } else if (color == GREEN_COLOR) {
                dp[N][GREEN_COLOR] = Math.min(initDP(N - 1, RED_COLOR), initDP(N - 1, BLUE_COLOR))
                        + cost[N][GREEN_COLOR];
            } else {
                dp[N][BLUE_COLOR] = Math.min(initDP(N - 1, RED_COLOR), initDP(N - 1, GREEN_COLOR))
                        + cost[N][BLUE_COLOR];
            }
        }
        return dp[N][color];
    }

}
