package baa_kingDog.recursion._1992_쿼드트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int[][] screen;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        screen = new int[N][N];

        for (int h = 0; h < N; h++) {
            String[] colorInfo = br.readLine().split("");
            for (int w = 0; w < N; w++) {
                screen[h][w] = Integer.parseInt(colorInfo[w]);
            }
        }

        quadTree(0, 0, N);

        System.out.println(result);
    }

    private static void quadTree(int row, int col, int size) {
        if (isOneColor(row, col, size)) {
            result.append(screen[row][col]);
            return;
        }

        int resize = size / 2;

        result.append('(');
        quadTree(row, col, resize);
        quadTree(row, col + resize, resize);
        quadTree(row + resize, col, resize);
        quadTree(row + resize, col + resize, resize);
        result.append(')');
    }

    private static boolean isOneColor(int row, int col, int size) {
        int color = screen[row][col];
        for (int h = row; h < row + size; h++) {
            for (int w = col; w < col + size; w++) {
                if (color != screen[h][w]) return false;
            }
        }
        return true;
    }

}
