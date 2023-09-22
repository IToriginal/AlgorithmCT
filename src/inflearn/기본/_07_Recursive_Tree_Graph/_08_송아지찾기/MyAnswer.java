package inflearn.기본._07_Recursive_Tree_Graph._08_송아지찾기;

import java.io.*;
import java.util.*;

public class MyAnswer {
    int[] dict = {1, -1, 5};

    int[] visit;

    Queue<Integer> queue = new LinkedList<>();

    public int BFS(int s, int e) {
        int answer = 0;
        visit = new int[10001];
        visit[s] = 1;
        queue.offer(s);

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();
                for (int j = 0; j < dict.length; j++) {
                    int nx = x + dict[j];
                    if (nx == e) return answer + 1;
                    if (nx >= 1 && nx <= 10000 && visit[nx] == 0) {
                        visit[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            answer++;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int s = Integer.parseInt(input[0]); // 5
        int e = Integer.parseInt(input[1]); // 14
        System.out.println(T.BFS(s, e)); // 3
    }
}
