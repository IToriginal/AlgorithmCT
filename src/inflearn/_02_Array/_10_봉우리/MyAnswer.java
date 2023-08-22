package inflearn._02_Array._10_봉우리;

import java.io.*;

/**
 * 2023. 08. 21 (월) - 1차 실패,, 구현 실패
 */
public class MyAnswer {
    // 상하좌우 좌표
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    public int solution(int N, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && ny >= 0 && nx < N && ny < N && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }
        System.out.println(T.solution(N, arr));
    }
}
