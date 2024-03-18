package baa_kingDog.backtracking._15652_N과M_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N, M;
    static int[] selected;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        N = Integer.parseInt(numbers[0]);
        M = Integer.parseInt(numbers[1]);
        selected = new int[M];

        backtracking(1, 0);
        System.out.println(result);
    }

    private static void backtracking(int start, int depth) {
        if (depth == M) {
            for (int num : selected) {
                result.append(num).append(" ");
            }
            result.append("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
            selected[depth] = i;
            backtracking(i, depth + 1);
        }
    }

}
