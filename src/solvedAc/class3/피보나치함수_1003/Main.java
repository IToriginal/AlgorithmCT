package solvedAc.class3.피보나치함수_1003;

import java.io.*;
import java.util.*;

public class Main {
    static Integer[][] dp = new Integer[41][2];

    static Integer[] fibo(int n) {
        if (dp[n][0] == null || dp[n][1] == null) {
            dp[n][0] = fibo(n - 1)[0] + fibo(n - 2)[0];
            dp[n][1] = fibo(n - 1)[1] + fibo(n - 2)[1];
        }
        return dp[n];
    }

    public ArrayList<Integer[]> solution(int t, int[] arr) {
        ArrayList<Integer[]> answer = new ArrayList<>();
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int idx = 0;
        while (t-- > 0) {
            int n = arr[idx++];
            fibo(n);
            answer.add(new Integer[] {dp[n][0], dp[n][1]});
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) arr[i] = Integer.parseInt(br.readLine());
        ArrayList<Integer[]> result = T.solution(t, arr);
        for (Integer[] x : result) System.out.println(x[0] + " " + x[1]);
    }
}
