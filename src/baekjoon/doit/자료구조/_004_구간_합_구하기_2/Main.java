package baekjoon.doit.자료구조._004_구간_합_구하기_2; // BOJ11660 - S1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N, M;

    private int rangeSum(int[] test, int[][] sumMetrix) {
        int startX = test[0], startY = test[1], endX = test[2], endY = test[3];
        return sumMetrix[endX][endY]
                - sumMetrix[startX - 1][endY]
                - sumMetrix[endX][startY - 1]
                + sumMetrix[startX - 1][startY - 1];
    }

    private int[][] sectionSum(int[][] metrix) {
        int[][] sumMetrix = new int[N + 1][N + 1];
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                sumMetrix[i][j] = sumMetrix[i][j - 1]
                        + sumMetrix[i - 1][j]
                        - sumMetrix[i - 1][j - 1]
                        + metrix[i][j];
            }
        }
        return sumMetrix;
    }

    public int[] solution(int[][] metirx, int[][] testCase) {
        int[] result = new int[M];
        int[][] sumMetrix = sectionSum(metirx);

        int idx = 0;
        for (int[] test : testCase) {
            result[idx++] = rangeSum(test, sumMetrix);
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nAndM = br.readLine().split(" ");
        N = Integer.parseInt(nAndM[0]);
        M = Integer.parseInt(nAndM[1]);

        int[][] metrix = new int[N + 1][N + 1];
        for (int i = 1; i < N + 1; i++) {
            String[] mValue = br.readLine().split(" ");
            for (int j = 1; j < N + 1; j++) {
                metrix[i][j] = Integer.parseInt(mValue[j - 1]);
            }
        }

        int[][] testCase = new int[M][4];
        for (int i = 0; i < M; i++) {
            String[] cord = br.readLine().split(" ");
            for (int j = 0; j < 4; j++) {
                testCase[i][j] = Integer.parseInt(cord[j]);
            }
        }

        for (int result : T.solution(metrix, testCase)) {
            System.out.println(result);
        }
    }

}
