package inflearn._08_DFS_BFS._01_합이같은부분집합;

import java.io.*;

public class MyAnswer {
    private boolean flag = false;

    private void DFS(int level, int sum, int[] arr, int total) {
        if (flag || sum > total / 2) return;
        if (level == arr.length) {
            if (sum == total - 2) {
                flag = true;
            }
            return;
        }
        DFS(level + 1, sum + arr[level], arr, total);
        DFS(level + 1, sum, arr, total);
    }

    public String solution(int n, int[] arr) {
        int total = 0;
        for (int i = 0; i < n; i++) total += arr[i];
        DFS(0, 0, arr, total);
        return flag ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(input[i]);
        System.out.println(T.solution(n, arr));
    }
}
