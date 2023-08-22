package inflearn._02_Array._09_격자판최대합;

import java.io.*;
import java.util.Arrays;

/**
 * 2023. 08. 21 (월) - 1차 실패,, 구현 실패
 */
public class MyAnswer {
    public int solution(int N, String[] arr) {
        int answer = 0;
        int[][] matrix = new int[N][N];
        int[] horizonSumArr = new int[N];
        int[] verticalSumArr = new int[N];
        int rightDiaSum = 0;
        int leftDiaSum = 0;

        for (int i = 0; i < N; i++) {
            String[] data = arr[i].split(" ");

            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(data[j]);

                // 가로, 세로의 합
                horizonSumArr[i] += matrix[i][j];
                verticalSumArr[i] += matrix[j][i];

                // 왼쪽, 오른쪽 대각선의 합
                if (i == j) leftDiaSum += matrix[i][j];
                if (i + j == N - 1) rightDiaSum += matrix[j][i];
            }
        }

        System.out.println(Arrays.toString(horizonSumArr));
        System.out.println(Arrays.toString(verticalSumArr));
        System.out.println(leftDiaSum);
        System.out.println(rightDiaSum);


        for (int i = 0; i < N; i++) {
            if (answer < horizonSumArr[i]) answer = horizonSumArr[i];
            if (answer < verticalSumArr[i]) answer = verticalSumArr[i];
        }
        if (answer < leftDiaSum) answer = leftDiaSum;
        if (answer < rightDiaSum) answer = rightDiaSum;

        return answer;
    }
    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] data = new String[N];
        for (int i = 0; i < N; i++) {
            data[i] = br.readLine();
        }

        System.out.println(T.solution(N, data));
    }
}
