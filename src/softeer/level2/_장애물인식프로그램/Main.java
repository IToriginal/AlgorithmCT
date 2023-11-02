package softeer.level2._장애물인식프로그램;

import java.io.*;
import java.util.*;

public class Main {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static int count;

    private void BFS(int x, int y, int[][] map, int n) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        map[x][y] = 0;

        while(!queue.isEmpty()) {
            count++;
            int[] curPosition = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = curPosition[0] + dx[i];
                int ny = curPosition[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n && map[nx][ny] == 1) {
                    map[nx][ny] = 0;
                    queue.offer(new int[] {nx, ny});
                }
            }

        }

    }

    public List<Integer> solution(int n, int[][] map) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    count = 0;
                    BFS(i, j, map, n);
                    result.add(count);
                }
            }
        }

        System.out.println(result.size());
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        for (int result : T.solution(n, map)) {
            System.out.println(result);
        }
    }

}
