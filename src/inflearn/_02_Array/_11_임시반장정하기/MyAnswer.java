package inflearn._02_Array._11_임시반장정하기;

import java.io.*;

/**
 * 2023. 08. 21 (월) - 1차 실패,, 구현 실패
 */

public class MyAnswer {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = 0;

        for (int i = 1; i <= n; i++) {
            int pairCnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        pairCnt++;
                        break;
                    }
                }
            }
            if (pairCnt > max) {
                max = pairCnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = Integer.parseInt(input[j - 1]);
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
