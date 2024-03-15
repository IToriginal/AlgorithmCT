package baa_kingDog.recursion._1780_종이의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int[][] paper;
    static int PATTERN_1 = 0; // -1
    static int PATTERN_2 = 0; // 0
    static int PATTERN_3 = 0; // 1

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for (int h = 0; h < N; h++) {
            String[] paperInfo = br.readLine().split(" ");
            for (int w = 0; w < N; w++) {
                paper[h][w] = Integer.parseInt(paperInfo[w]);
            }
        }

        cut(0, 0, N);

        System.out.println(PATTERN_1);
        System.out.println(PATTERN_2);
        System.out.println(PATTERN_3);
    }

    private static void cut(int row, int col, int size) {
        if (validPattern(row, col, size)) {
            if (paper[row][col] == -1) {
                PATTERN_1++;
            } else if (paper[row][col] == 0) {
                PATTERN_2++;
            } else {
                PATTERN_3++;
            }
            return;
        }

        int resize = size / 3;

        cut(row, col, resize); // 종이 위치: 좌측 상단
        cut(row, col + resize, resize); // 종이 위치: 중간 상단
        cut(row, col + 2 * resize, resize); // 종이 위치: 우측 상단

        cut(row + resize, col, resize); // 중간 좌측
        cut(row + resize, col + resize, resize); // 중앙
        cut(row + resize, col + 2 * resize, resize); // 중간 우측

        cut(row + 2 * resize, col, resize); // 좌측 하단
        cut(row + 2 * resize, col + resize, resize); // 중간 하단
        cut(row + 2 * resize, col + 2 * resize, resize); // 우측 하단

    }

    private static boolean validPattern(int row, int col, int size) {
        int pattern = paper[row][col];

        for (int h = row; h < row + size; h++) {
            for (int w = col; w < col + size; w++) {
                if (pattern != paper[h][w]) {
                    return false;
                }
            }
        }

        return true;
    }

}
