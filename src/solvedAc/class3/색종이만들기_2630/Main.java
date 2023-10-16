package solvedAc.class3.색종이만들기_2630;

import java.io.*;

public class Main {
    static int[][] paper;
    static int white_paper = 0, blue_paper = 0;

    private boolean colorCheck(int x, int y, int n) {
        int color = paper[x][y];
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (paper[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }

    private void cut(int x, int y, int n) {
        if (colorCheck(x, y, n)) {
            if (paper[x][y] == 0) white_paper++;
            else blue_paper++;
            return;
        }
        
        int half = n / 2;
        cut(x, y + half, half); // 1사분면
        cut(x, y, half); // 2사분면
        cut(x + half, y, half); // 3사분면
        cut(x + half, y + half, half); // 4사분면
    }

    public int[] solution(int n, int[][] paper) {
        int[] answer = new int[2]; // answer[0] = 하얀색 색종이의 수, answer[1] = 파란색 색종이의 수
        cut(0, 0, n);
        answer[0] = white_paper;
        answer[1] = blue_paper;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] input_x = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                paper[i][j] = Integer.parseInt(input_x[j]);
            }
        }
        for (int result : T.solution(n, paper)) System.out.println(result);
    }
}
