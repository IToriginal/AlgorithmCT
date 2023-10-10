package baekjoon.그래프와순회.알고리즘수업_너비우선탐색2_24445;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static Queue<Integer> queue = new LinkedList<>();
    static int[] visit;
    static int turn;

    public void BFS(int start) {
        queue.add(start);
        visit[start] = turn;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int nextNode : graph.get(node)) {
                if (visit[nextNode] == 0) {
                    queue.add(nextNode);
                    visit[nextNode] = ++turn;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
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
        for (int i = 1; i < graph.size(); i++) Collections.sort(graph.get(i), Collections.reverseOrder());
        turn = 1;
        T.BFS(r);
        for (int i = 1; i <= n; i++) System.out.println(visit[i]);
    }
}

