package baa_kingDog.bfs._5427_불; // G4 - TODO: 시간 초과

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    static StringBuilder result = new StringBuilder();
    static Queue<int[]> fire = new LinkedList<>();
    static int W, H, startX, startY;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        List<int[]> antiFireCoordinate = new ArrayList<>();
        int preTime = 0;

        visited[startX][startY] = true;
        queue.add(new int[]{startX, startY, 0});

        while (!queue.isEmpty()) {
            int x = queue.peek()[0];
            int y = queue.peek()[1];
            int time = queue.peek()[2];
            queue.poll();

            // 같은 시간 모든 위치를 탐색한 경우, 불을 붙이기 위해 fire 예상 좌표를 추가
            if (time != preTime) {
                fire.addAll(antiFireCoordinate);
            }

            while (!fire.isEmpty()) { // 불이 예상 되는 칸 체크
                int antiX = fire.peek()[0];
                int antiY = fire.peek()[1];
                fire.poll();

                for (int i = 0; i < 4; i++) {
                    int fireX = antiX + dx[i];
                    int fireY = antiY + dy[i];

                    if (fireX >= 0 && fireY >= 0 && fireX < H && fireY < W) {
                        if (map[fireX][fireY] == '.') {
                            map[fireX][fireY] = '*';
                            antiFireCoordinate.add(new int[]{fireX, fireY}); // 다음에 불을 옮기기 위해 저장
                        }
                    }
                }
            }

            if (x == 0 || x == H - 1 || y == 0 || y == W - 1) {
                result.append(time + 1).append('\n');
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if (nextX >= 0 && nextY >= 0 && nextX < H && nextY < W) {
                    if (!visited[nextX][nextY]) {
                        if (map[nextX][nextY] == '.') {
                            visited[nextX][nextY] = true;
                            queue.add(new int[]{nextX, nextY, time + 1});
                        }
                    }
                }
            }

            preTime = time;
        }

        result.append("IMPOSSIBLE").append('\n');

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int testCase = 0; testCase < T; testCase++) {
            String[] mapInit = br.readLine().split(" ");
            W = Integer.parseInt(mapInit[0]); // 가로
            H = Integer.parseInt(mapInit[1]); // 세로

            map = new char[H][W]; // [세로][가로]
            visited = new boolean[H][W];

            for (int h = 0; h < H; h++) {
                char[] mapInfo = br.readLine().toCharArray();
                for (int w = 0; w < W; w++) {
                    if (mapInfo[w] == '@') {
                        startX = h;
                        startY = w;
                    } else if (mapInfo[w] == '*') {
                        fire.add(new int[]{h, w});
                    }
                    map[h][w] = mapInfo[w];
                }
            }

            bfs();
        }

        System.out.println(result);
    }

}
