package inflearn.기본._08_DFS_BFS._02_바둑이승차;

import java.util.*;

public class Answer {
    static int answer = Integer.MIN_VALUE, c, n;

    public void DFS(int L, int sum, int[] arr) {
        if (sum > c) return;
        if (L == n) answer = Math.max(answer, sum);
        else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
