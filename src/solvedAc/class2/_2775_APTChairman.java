package solvedAc.class2;

import java.io.*;

public class _2775_APTChairman {
    public static int[][] APT = new int[15][15];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        createAPT();
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            result.append(APT[k][n]).append('\n');
        }
        System.out.println(result);
    }

    public static void createAPT() {
        for (int i = 0; i < 15; i++) {
            APT[i][1] = 1;
            APT[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }
    }
}
