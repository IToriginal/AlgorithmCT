package baekjoon.doit.탐색._025_친구_관계_파악하기; // BOJ13023 - G5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    private static int n, m;
    private static List<List<Integer>> aList;
    private static boolean[] visited;
    private static boolean isFriendShip;

    private void DFS(int node, int depth) {
        if (depth == 5 || isFriendShip) {
            isFriendShip = true;
            return;
        }
        visited[node] = true;
        aList.get(node).stream()
                .filter(next -> !visited[next])
                .forEach(next -> DFS(next, depth + 1));
        visited[node] = false;
    }

    public int solution() {
        visited = new boolean[n];
        isFriendShip = false;
        for (int i = 0; i < n; i++) {
            DFS(i, 1);
            if (isFriendShip) break;
        }
        return isFriendShip ? 1 : 0;
    }

    public void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]); // 사람의 수
        m = Integer.parseInt(input[1]); // 친구 관계의 수

        aList = new ArrayList<>(); // 친구 관계의 인접 리스트 생성
        for (int i = 0; i < n; i++) {
            aList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] data = br.readLine().split(" ");
            int a = Integer.parseInt(data[0]);
            int b = Integer.parseInt(data[1]);
            aList.get(a).add(b);
            aList.get(b).add(a);
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
