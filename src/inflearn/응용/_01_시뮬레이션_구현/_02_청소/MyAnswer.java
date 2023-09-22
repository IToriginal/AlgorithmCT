package inflearn.응용._01_시뮬레이션_구현._02_청소;

import java.util.*;

public class MyAnswer {
    public int[] solution(int[][] board, int k){
        int[] answer = new int[2];
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        int n = board.length;
        int x = 0, y = 0, d = 1, time = 0;

        while (time != k) {
            time++;
            int nx = x + dx[d];
            int ny = y + dy[d];

            // 이동이 불가능한 조건 (벽을 만남. 범위를 초과)
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || board[nx][ny] == 1) {
                // 시계방향회전
                d = (d + 1) % 4;
                continue;
            }

            x = nx;
            y = ny;
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }

    public static void main(String[] args) {
        MyAnswer T = new MyAnswer();
        int[][] arr1 = {
            {0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1},
            {0, 0, 0, 0, 0}
        };
        System.out.println(Arrays.toString(T.solution(arr1, 10)));

        int[][] arr2 = {
            {0, 0, 0, 1, 0, 1},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1},
            {1, 1, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        System.out.println(Arrays.toString(T.solution(arr2, 20)));

        int[][] arr3 = {
            {0, 0, 1, 0, 0},
            {0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {1, 0, 0, 0, 1},
            {0, 0, 0, 0, 0}
        };
        System.out.println(Arrays.toString(T.solution(arr3, 25)));
    }
}
