package baa_kingDog.bfs._7569_토마토;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int M, N, H;
    static int[][][] tomatoHouse;
    static int[] dm = {0, -1, 0, 1, 0, 0};
    static int[] dn = {1, 0, -1, 0, 0, 0};
    static int[] dh = {0, 0, 0, 0, 1, -1};

    static void bfs() {
        Queue<int[]> queue = new LinkedList<>();

        // 익은 토마토 위치를 큐에 초기화
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (tomatoHouse[h][n][m] == 1) {
                        queue.add(new int[]{h, n, m});
                    }
                }
            }
        }

        int days = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();
                int h = pos[0];
                int n = pos[1];
                int m = pos[2];

                for (int j = 0; j < 6; j++) { // 상 하 좌 우 위 아래 (6)
                    int curH = h + dh[j];
                    int curN = n + dn[j];
                    int curM = m + dm[j];

                    if (curH >= 0 && curN >= 0 && curM >= 0 && curH < H && curN < N && curM < M) {
                        if (tomatoHouse[curH][curN][curM] == 0) {
                            queue.add(new int[]{curH, curN, curM});
                            tomatoHouse[curH][curN][curM] = 1;
                        }
                    }
                }
            }

            days++;
        }

        if (isAllRipe()) {
            System.out.println(days - 1);
        } else {
            System.out.println(-1);
        }
    }

    static boolean isAllRipe() {
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (tomatoHouse[h][n][m] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] boxInfo = br.readLine().split(" ");
        M = Integer.parseInt(boxInfo[0]); // 가로
        N = Integer.parseInt(boxInfo[1]); // 세로
        H = Integer.parseInt(boxInfo[2]); // 높이

        tomatoHouse = new int[H][N][M]; // 높이, 세로, 가로

        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                String[] tomatoInfo = br.readLine().split(" ");
                for (int m = 0; m < M; m++) {
                    tomatoHouse[h][n][m] = Integer.parseInt(tomatoInfo[m]);
                }
            }
        }

        bfs();
    }

}
