package inflearn.기본._02_Array._10_봉우리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private int n;
    private int[][] matrix;
    private final int[] dx = {0, 1, 0, -1};
    private final int[] dy = {1, 0, -1, 0};

    private int solution() {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isPeak(i, j)) {
                    answer++;
                }
            }
        }
        return answer;
    }

    private boolean isPeak(int x, int y) {
        for (int dirt = 0; dirt < 4; dirt++) {
            int nx = x + dx[dirt];
            int ny = y + dy[dirt];
            if (isValidIndex(nx, ny) && matrix[nx][ny] >= matrix[x][y]) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidIndex(int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < n;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
