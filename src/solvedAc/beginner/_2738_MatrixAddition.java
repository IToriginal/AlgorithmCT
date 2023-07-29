package solvedAc.beginner;

import java.io.*;

public class _2738_MatrixAddition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] matrix = input.split(" ");

        int n = Integer.parseInt(matrix[0]);
        int m = Integer.parseInt(matrix[1]);

        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[n][m];
        int[][] matrixP = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = Integer.parseInt(values[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrixB[i][j] = Integer.parseInt(values[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixP[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrixP[i][j] + " ");
            }
            System.out.println();
        }
        br.close();
    }
}
