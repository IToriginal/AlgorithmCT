package inflearn.응용._01_시뮬레이션_구현._04_좌석번호;

import java.util.*;
public class MyAnswer {
    public int[] solution(int c, int r, int k){
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        int[] answer = new int[2];
        if (k > c * r) return answer;

        boolean[][] seat = new boolean[c][r];
        int count = 1, x = 0, y = 0, d = 1;
        seat[0][0] = true;
        while (count != k) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (nx < 0 || nx >= c || ny < 0 || ny >= r || seat[nx][ny]) {
                d = (d + 1) % 4;
                continue;
            }
            seat[nx][ny] = true;
            count++;
            x = nx;
            y = ny;
        }

        answer[0] = x + 1;
        answer[1] = y + 1;
        return answer;
    }

    public static void main(String[] args){
        MyAnswer T = new MyAnswer();
        System.out.println(Arrays.toString(T.solution(6, 5, 12)));
        System.out.println(Arrays.toString(T.solution(6, 5, 20)));
        System.out.println(Arrays.toString(T.solution(6, 5, 30)));
        System.out.println(Arrays.toString(T.solution(6, 5, 31)));
    }
}