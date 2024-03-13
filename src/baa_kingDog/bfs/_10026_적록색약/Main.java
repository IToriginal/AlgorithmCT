package baa_kingDog.bfs._10026_적록색약; // Gold5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int N, countR, countG, countB, countRG, countBofRG;
    static String[][] grid;
    static boolean[][] visited;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    static void bfs(int x, int y, String color, String color2) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            x = queue.peek()[0];
            y = queue.peek()[1];
            visited[x][y] = true;
            queue.poll();

            for (int i = 0; i < 4; i++) {
                int curX = x + dx[i];
                int curY = y + dy[i];

                if (curX >= 0 && curY >= 0 && curX < N && curY < N) {
                    if ((grid[curX][curY].equals(color) || grid[curX][curY].equals(color2)) &&
                            !visited[curX][curY]) {
                        queue.add(new int[]{curX, curY});
                        visited[curX][curY] = true;
                    }
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N][N];

        grid = new String[N][N];
        for (int row = 0; row < N; row++) {
            String[] colorInfo = br.readLine().split("");
            for (int col = 0; col < N; col++) {
                grid[row][col] = colorInfo[col];
            }
        }

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (grid[row][col].equals("R") && !visited[row][col]) {
                    bfs(row, col, "R", null);
                    countR++;
                }

                if (grid[row][col].equals("G") && !visited[row][col]) {
                    bfs(row, col, "G", null);
                    countG++;
                }

                if (grid[row][col].equals("B") && !visited[row][col]) {
                    bfs(row, col, "B", null);
                    countB++;
                }
            }
        }
        result.append(countR + countG + countB).append(" ");

        visited = new boolean[N][N];
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if ((grid[row][col].equals("R") || grid[row][col].equals("G")) &&
                        !visited[row][col]) {
                    bfs(row, col, "R", "G");
                    countRG++;
                }
                if (grid[row][col].equals("B") && !visited[row][col]) {
                    bfs(row, col, "B", null);
                    countBofRG++;
                }
            }
        }
        result.append(countRG + countBofRG).append(" ");

        System.out.println(result);
    }

}
