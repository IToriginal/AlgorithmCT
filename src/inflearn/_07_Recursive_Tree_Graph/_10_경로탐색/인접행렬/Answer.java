package inflearn._07_Recursive_Tree_Graph._10_경로탐색.인접행렬;

import java.util.*;

public class Answer {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch; // 방문 체크

    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0; // 백트레킹
                }
            }
        }
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][n + 1]; // 0번은 버림 1부터 시작하기 위해서
        ch = new int[n + 1]; // 그래프의 이유와 동일함
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1; // 출발점
        T.DFS(1);
        System.out.println(answer);
    }
}
