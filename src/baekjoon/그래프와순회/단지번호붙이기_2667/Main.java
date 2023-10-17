package baekjoon.그래프와순회.단지번호붙이기_2667;

import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer> answer = new ArrayList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, count;

    public void BFS(int x, int y, int[][] map) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        map[x][y] = 0;

        while (!queue.isEmpty()) {
            count += 1;
            int[] curPos = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = curPos[0] + dx[i];
                int ny = curPos[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n && map[nx][ny] == 1) {
                    map[nx][ny] = 0;
                    queue.offer(new int[] {nx, ny});
                }
            }
        }
    }

    public ArrayList<Integer> solution(int[][] map) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    count = 0;
                    BFS(i, j, map);
                    answer.add(count);
                }
            }
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }
        for (int town : T.solution(map)) System.out.println(town);
    }
}
