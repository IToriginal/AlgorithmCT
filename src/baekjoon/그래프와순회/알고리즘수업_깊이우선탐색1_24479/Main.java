package baekjoon.그래프와순회.알고리즘수업_깊이우선탐색1_24479;

import java.io.*;
import java.util.*;

/**
 * DFS(깊이 우선 탐색)를 배우는 문제. https://www.acmicpc.net/problem/24479
 */
public class Main {
    static StringBuilder sb = new StringBuilder();
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] visit;
    static int turn;

    public void DFS(int node) {
        visit[node] = turn;
        for (int nextNode : graph.get(node)) {
            if (visit[nextNode] == 0) {
                turn++;
                DFS(nextNode);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int m = Integer.parseInt(input1[1]);
        int r = Integer.parseInt(input1[2]);
        visit = new int[n + 1];
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            String[] input2 = br.readLine().split(" ");
            int a = Integer.parseInt(input2[0]);
            int b = Integer.parseInt(input2[1]);
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for (int i = 1; i < graph.size(); i++) Collections.sort(graph.get(i));
        turn = 1;
        T.DFS(r);
        for (int i = 1; i < visit.length; i++) sb.append(visit[i]).append('\n');
        System.out.println(sb);
    }
}
