package inflearn.기본._02_Array._09_격자판최대합;

import java.io.*;

public class MyAnswer2 {
    public int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int horizonSum = 0;
            int verticalSum = 0;
            for (int j = 0; j < n; j++) {
                horizonSum += arr[i][j];
                verticalSum += arr[j][i];
            }
            answer = Math.max(answer, horizonSum);
            answer = Math.max(answer, verticalSum);
        }

        int rightDiaSum = 0;
        int leftDiaSum = 0;
        for (int i = 0; i < n; i++) {
            rightDiaSum += arr[i][i];
            leftDiaSum += arr[i][n - i - 1];
        }
        answer = Math.max(answer, rightDiaSum);
        answer = Math.max(answer, leftDiaSum);

        return answer;
    }
    public static void main(String[] args) throws IOException {
        MyAnswer2 T = new MyAnswer2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
