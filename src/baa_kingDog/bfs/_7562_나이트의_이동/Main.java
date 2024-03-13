package baa_kingDog.bfs._7562_나이트의_이동;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int I;
    static int beforeX, beforeY, afterX, afterY;
    static int[][] chess;
    static boolean[][] visited;
    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};

    static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{beforeX, beforeY});
        visited[beforeX][beforeY] = true;

        while (!queue.isEmpty()) {
            int x = queue.peek()[0];
            int y = queue.peek()[1];
            queue.poll();

            for (int i = 0; i < 8; i++) {
                int curX = x + dx[i];
                int curY = y + dy[i];

                if (curX >= 0 && curY >= 0 && curX < I && curY < I) {
                    if (!visited[curX][curY]) {
                        queue.add(new int[]{curX, curY});
                        chess[curX][curY] = chess[x][y] + 1;
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
            I = Integer.parseInt(br.readLine());

            chess = new int[I][I];
            visited = new boolean[I][I];

            String[] nightPosInfo = br.readLine().split(" ");
            beforeX = Integer.parseInt(nightPosInfo[0]);
            beforeY = Integer.parseInt(nightPosInfo[1]);

            String[] nightMoveInfo = br.readLine().split(" ");
            afterX = Integer.parseInt(nightMoveInfo[0]);
            afterY = Integer.parseInt(nightMoveInfo[1]);

            bfs();
            result.append(chess[afterX][afterY]).append("\n");
        }
        System.out.println(result);
    }

}
