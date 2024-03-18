package baa_kingDog.recursion._2630_색종이_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int[][] paper;
    static int WHITE_PAPER = 0, BLUE_PAPER = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for (int h = 0; h < N; h++) {
            String[] colorInfo = br.readLine().split(" ");
            for (int w = 0; w < N; w++) {
                paper[h][w] = Integer.parseInt(colorInfo[w]);
            }
        }

        cut(0, 0, N);
        System.out.println(WHITE_PAPER);
        System.out.println(BLUE_PAPER);
    }

    private static void cut(int row, int col, int size) {
        if (validateColor(row, col, size)) {
            if (paper[row][col] == 1) BLUE_PAPER++;
            else WHITE_PAPER++;
            return;
        }

        int resize = size / 2;

        cut(row, col, resize);
        cut(row, col + resize, resize);
        cut(row + resize, col, resize);
        cut(row + resize, col + resize, resize);
    }

    private static boolean validateColor(int row, int col, int size) {
        int color = paper[row][col];

        for (int h = row; h < row + size; h++) {
            for (int w = col; w < col + size; w++) {
                if (color != paper[h][w]) return false;
            }
        }

        return true;
    }
}