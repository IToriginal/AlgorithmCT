package inflearn._07_Recursive_Tree_Graph._10_경로탐색.인접리스트;

import java.io.*;
import java.util.*;

public class MyAnswer {
    static ArrayList<ArrayList<Integer>> graph;
    static int n, m, answer = 0;
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

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        n = Integer.parseInt(input1[0]);
        m = Integer.parseInt(input1[1]);
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        visit = new int[n + 1];
        for (int i = 0; i < m; i++) {
            String[] input2 = br.readLine().split(" ");
            int a = Integer.parseInt(input2[0]);
            int b = Integer.parseInt(input2[1]);
            graph.get(a).add(b);
        }
        visit[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
