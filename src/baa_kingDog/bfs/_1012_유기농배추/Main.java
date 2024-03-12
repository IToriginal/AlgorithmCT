package baa_kingDog.bfs._1012_유기농배추;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int M, N, K;
    static int[][] ground;
    static boolean[][] visited;
    static int count;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    static void bfs(int x, int y) {
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

                if (curX >= 0 && curY >= 0 && curX < M && curY < N) {
                    if (!visited[curX][curY] && ground[curX][curY] == 1) {
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
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 0; testCase < T; testCase++) {
            String[] matrixInfo = br.readLine().split(" ");
            M = Integer.parseInt(matrixInfo[0]);
            N = Integer.parseInt(matrixInfo[1]);
            K = Integer.parseInt(matrixInfo[2]);

            ground = new int[M][N];
            visited = new boolean[M][N];
            count = 0;

            for (int coordinate = 0; coordinate < K; coordinate++) {
                String[] coordinateInfo = br.readLine().split(" ");
                int x = Integer.parseInt(coordinateInfo[0]);
                int y = Integer.parseInt(coordinateInfo[1]);
                ground[x][y] = 1;
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (ground[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        count++;
                    }
                }
            }
            result.append(count).append("\n");
        }
        System.out.println(result);
    }

}

