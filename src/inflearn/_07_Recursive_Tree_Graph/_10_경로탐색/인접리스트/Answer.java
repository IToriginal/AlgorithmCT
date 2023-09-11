package inflearn._07_Recursive_Tree_Graph._10_경로탐색.인접리스트;

import java.util.*;

public class Answer {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] visit;

    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int next_v : graph.get(v)) {
                if (visit[next_v] == 0) {
                    visit[next_v] = 1;
                    DFS(next_v);
                    visit[next_v] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        visit = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        visit[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
