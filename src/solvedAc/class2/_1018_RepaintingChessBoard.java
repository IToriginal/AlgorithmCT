package solvedAc.class2;

import java.io.*;

public class _1018_RepaintingChessBoard {
    public static boolean[][] arr;
    public static int min = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] numbers = input.split(" ");

        int n = Integer.parseInt(numbers[0]);
        int m = Integer.parseInt(numbers[1]);

        arr = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String board = br.readLine();

            for (int j = 0; j < m; j++) {
                if (board.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int n_row = n - 7;
        int m_col = m - 7;

        for (int i = 0; i < n_row; i++) {
            for (int j = 0; j < m_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean tf = arr[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (arr[i][j] != tf) {
                    count++;
                }
                tf = (!tf);
            }
            tf = (!tf);
        }
        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}
