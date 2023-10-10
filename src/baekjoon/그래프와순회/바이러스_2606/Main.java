package baekjoon.그래프와순회.바이러스_2606;

import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> networks = new ArrayList<>();
    static boolean[] visit;
    static int answer = 0;

    public void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visit[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int nextNode : networks.get(node)) {
                if (!visit[nextNode]) {
                    visit[nextNode] = true;
                    queue.add(nextNode);
                    answer++;
                }
            }
        }
    }

    public int solution(int n, int m, int r) {
        BFS(r);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 컴퓨터(정점)의 수
        int m = Integer.parseInt(br.readLine()); // 간선의 수
        int r = 1; // 시작 노드
        for (int i = 0; i <= n; i++) networks.add(new ArrayList<>());
        visit = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            networks.get(a).add(b);
            networks.get(b).add(a);
        }
        System.out.println(T.solution(n, m, r));
    }
}
