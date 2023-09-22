package inflearn.기본._08_DFS_BFS._03_최대점수구하기;

import java.io.*;

public class MyAnswer {
    private int max = Integer.MIN_VALUE;

    private void DFS(int level, int sum, int time, int[][] arr, int m) {
        if (time > m) return;
        if (level == arr.length) max = Math.max(max, sum);
        else {
            DFS(level + 1, sum + arr[level][0], time + arr[level][1], arr, m);
            DFS(level + 1, sum, time, arr, m);
        }
    }

    public int solution(int m, int[][] arr) {
        DFS(0, 0, 0, arr, m);
        return max;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int m = Integer.parseInt(input1[1]);
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] input2 = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input2[0]); // score
            arr[i][1] = Integer.parseInt(input2[1]); // time
        }
        System.out.println(T.solution(m, arr));
    }
}

