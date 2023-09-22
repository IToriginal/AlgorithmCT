package inflearn.기본._07_Recursive_Tree_Graph._11_그래프최단거리;

import java.io.*;
import java.util.*;

public class MyAnswer {
    static int n, m = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] visit, level;
    
    public void BFS(int v) {
        visit[v] = 1;
        level[v] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while (!queue.isEmpty()) {
            int current_v = queue.poll();
            for (int next_v : graph.get(current_v)) {
                if (visit[next_v] == 0) {
                    visit[next_v] = 1;
                    queue.offer(next_v);
                    level[next_v] = level[current_v] + 1;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        n = Integer.parseInt(input1[0]); // 6
        m = Integer.parseInt(input1[1]); // 9
        
        visit = new int[n + 1];
        level = new int[n + 1];
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            String[] input2 = br.readLine().split(" ");
            int a = Integer.parseInt(input2[0]);
            int b = Integer.parseInt(input2[1]);
            graph.get(a).add(b);
        }
        
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + level[i]);
        }
    }
}
