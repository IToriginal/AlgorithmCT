package baa_kingDog.backtracking._15655_N과M_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int N, M;
    static int[] nums;
    static int[] selected;
    static boolean[] visited;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        N = Integer.parseInt(line1[0]);
        M = Integer.parseInt(line1[1]);
        nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        selected = new int[M];
        visited = new boolean[N];

        backtracking(0, 0);
        System.out.print(result);
    }

    private static void backtracking(int start, int depth) {
        if (depth == M) {
            for (int num : selected) {
                result.append(num).append(" ");
            }
            result.append("\n");
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                selected[depth] = nums[i];
                backtracking(i, depth + 1);
                visited[i] = false;
            }
        }
    }

}
