package inflearn.기본._08_DFS_BFS._02_바둑이승차;

import java.io.*;

public class MyAnswer {
    private int max = Integer.MIN_VALUE;

    private void DFS(int level, int sum, int[] arr, int c) {
        if (sum > c) return;
        if (level == arr.length) max = Math.max(max, sum);
        else {
            DFS(level + 1, sum + arr[level], arr, c);
            DFS(level + 1, sum, arr, c);
        }
    }

    public int solution(int c, int[] arr) {
        DFS(0, 0, arr, c);
        return max;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int c = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
        System.out.println(T.solution(c, arr));
    }
}
