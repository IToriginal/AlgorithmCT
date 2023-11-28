package baekjoon.doit.탐색._026_DFS_BFS_프로그램; // BOJ1260 - S2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    private static int n, m, v;
    private static List<List<Integer>> aList;
    private static StringBuilder dfsResult, bfsResult;
    private static boolean[] visitedDFS, visitedBFS;

    private void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visitedBFS[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfsResult.append(node).append(" ");

            for (int neighbor : aList.get(node)) {
                if (!visitedBFS[neighbor]) {
                    visitedBFS[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    private void DFS(int node) {
        visitedDFS[node] = true;
        dfsResult.append(node).append(" ");
        for (int neigbor : aList.get(node)) {
            if (!visitedDFS[neigbor]) {
                DFS(neigbor);
            }
        }
    }

    private String solution() {
        dfsResult = new StringBuilder();
        bfsResult = new StringBuilder();
        visitedDFS = new boolean[n + 1];
        visitedBFS = new boolean[n + 1];

        DFS(v);
        BFS(v);

        return dfsResult.toString() + "\n" + bfsResult.toString();
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] graphInfo = br.readLine().split(" ");
        n = Integer.parseInt(graphInfo[0]); // 정점의 개수
        m = Integer.parseInt(graphInfo[1]); // 간선의 개수
        v = Integer.parseInt(graphInfo[2]); // 정점 번호
        aList = new ArrayList<>(); // 인접 리스트 생성
        for (int i = 0; i <= n; i++) {
            aList.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            String[] data = br.readLine().split(" ");
            int a = Integer.parseInt(data[0]);
            int b = Integer.parseInt(data[1]);
            aList.get(a).add(b);
            aList.get(b).add(a);
        }
        for (List<Integer> list : aList) {
            Collections.sort(list);
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
