package baekjoon.삼성A형.퇴사_14501;

import java.io.*;

public class Main {
    static int answer, n;
    static int[][] arr;

    private void DFS(int idx, int pay) {
        if (idx >= n) {
            answer = Math.max(answer, pay);
            return;
        }

        if (idx + arr[0][idx] <= n) {
            DFS(idx + arr[0][idx], pay + arr[1][idx]);
        } else {
            DFS(idx + arr[0][idx], pay);
        }

        DFS(idx + 1, pay);
    }

    public int solution(int n, int[][] arr) {
        answer = 0;
        DFS(0, 0);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[2][n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            arr[0][i] = Integer.parseInt(input[0]);
            arr[1][i] = Integer.parseInt(input[1]);
        }
        System.out.println(T.solution(n, arr));
    }
}
