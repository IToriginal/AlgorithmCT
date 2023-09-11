package inflearn._07_Recursive_Tree_Graph._10_경로탐색.인접행렬;

import java.io.*;

public class MyAnswer {
    static int[][] graph;

    static int[] visit;

    static int n, m, answer = 0;

    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && visit[i] == 0) {
                    visit[i] = 1;
                    DFS(i);
                    visit[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        n = Integer.parseInt(input1[0]); // n: 정점의 수
        m = Integer.parseInt(input1[1]); // m: 간선의 수
        graph = new int[n + 1][m + 1];
        visit = new int[n + 1];
        for (int i = 0; i < m; i++) {
            String[] input2 = br.readLine().split(" "); // 그래프 연결 정보
            int a = Integer.parseInt(input2[0]);
            int b = Integer.parseInt(input2[1]);
            graph[a][b] = 1;
        }
        visit[1] = 1; // start point
        T.DFS(1);
        System.out.println(answer);
    }
}