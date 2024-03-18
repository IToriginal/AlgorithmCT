package baa_kingDog.backtracking._15650_N과M_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N, M;
    static int[] selected;
    static boolean[] visited;

    static void backtracking(int depth) {
        if (depth == M) {
            for (int num : selected) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && (depth == 0 || selected[depth - 1] < i)) {
                visited[i] = true;
                selected[depth] = i;
                backtracking(depth + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        N = Integer.parseInt(numbers[0]);
        M = Integer.parseInt(numbers[1]);

        selected = new int[M];
        visited = new boolean[N + 1];

        backtracking(0);
    }

}
