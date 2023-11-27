package baekjoon.doit.탐색._023_연결요소의_개수_구하기; // BOJ11724 - S2

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static int n, m;
    public static List<List<Integer>> aList;
    public static boolean[] visited;

    public long solution() {
        visited = new boolean[n + 1];
        return IntStream.rangeClosed(1, n)
                .filter(i -> !visited[i])
                .peek(this::DFS)
                .count();
    }

    public void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        aList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            aList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] info = br.readLine().split(" ");
            int s = Integer.parseInt(info[0]);
            int e = Integer.parseInt(info[1]);
            aList.get(s).add(e);
            aList.get(e).add(s);
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

    private void DFS(int v) {
        visited[v] = true;
        aList.get(v).stream()
                .filter(e -> !visited[e])
                .forEach(this::DFS);
    }

}
