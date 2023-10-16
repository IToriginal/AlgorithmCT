package baekjoon.삼성A형.주사위굴리기_14499;

import java.io.*;
import java.util.ArrayList;

public class Main {
    static int n, m, x, y, k;
    static int[][] map;
    static ArrayList<Integer> answer;
    static int[] dice = new int[6];
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    static void moveRight() {
        int tmp = dice[0];
        dice[0] = dice[4];
        dice[4] = dice[1];
        dice[1] = dice[5];
        dice[5] = tmp;
    }

    static void moveLeft() {
        int tmp = dice[0];
        dice[0] = dice[5];
        dice[5] = dice[1];
        dice[1] = dice[4];
        dice[4] = tmp;
    }

    static void moveUp() {
        int tmp = dice[0];
        dice[0] = dice[2];
        dice[2] = dice[1];
        dice[1] = dice[3];
        dice[3] = tmp;
    }

    static void moveDown() {
        int tmp = dice[0];
        dice[0] = dice[3];
        dice[3] = dice[1];
        dice[1] = dice[2];
        dice[2] = tmp;
    }

    public ArrayList<Integer> solution(int[] order) {
        answer = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int direction = order[i];
            x += dx[direction];
            y += dy[direction];
            if (x < 0 || x >= n || y < 0 || y >= m) {
                x -= dx[direction];
                y -= dy[direction];
                continue;
            }

            switch (direction) {
                case 0:
                    moveRight();
                    break;
                case 1:
                    moveLeft();
                    break;
                case 2:
                    moveUp();
                    break;
                case 3:
                    moveDown();
                    break;
            }

            if (map[x][y] == 0) {
                map[x][y] = dice[1];
            } else {
                dice[1] = map[x][y];
                map[x][y] = 0;
            }
            answer.add(dice[0]);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        n = Integer.parseInt(input1[0]);
        m = Integer.parseInt(input1[1]);
        x = Integer.parseInt(input1[2]);
        y = Integer.parseInt(input1[3]);
        k = Integer.parseInt(input1[4]);

        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] input2 = br.readLine().split(" ");
            for (int j = 0; j < m; j++) map[i][j] = Integer.parseInt(input2[j]);
        }

        int[] order = new int[k];
        String[] input3 = br.readLine().split(" ");
        for (int i = 0; i < k; i++) order[i] = Integer.parseInt(input3[i]) - 1;

        for (int answer : T.solution(order)) System.out.println(answer);
    }
}