package baekjoon.doit.탐색._027_미로_탐색; // BOJ2178 - S1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    private static int[][] matrix;
    private static int n, m;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

    private int solution() {
        visited = new boolean[n][m];
        BFS(0, 0);
        return matrix[n - 1][m - 1];
    }

    private void BFS(int startX, int startY) {
        Queue<Spot> queue = new LinkedList<>();
        queue.offer(new Spot(startX, startY));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Spot spot = queue.poll();

            for (int direction = 0; direction < 4; direction++) {
                int nx = spot.x + dx[direction];
                int ny = spot.y + dy[direction];

                if (isValid(nx, ny) && !visited[nx][ny] && matrix[nx][ny] == 1) {
                    queue.offer(new Spot(nx, ny));
                    matrix[nx][ny] = matrix[spot.x][spot.y] + 1;
                    visited[nx][ny] = true;
                }
            }
        }
    }

    private boolean isValid(int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < m;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] data = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(data[j]);
            }
        }
    }

}

class Spot {

    int x;
    int y;

    Spot(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
