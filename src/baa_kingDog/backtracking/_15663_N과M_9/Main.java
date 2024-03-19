package baa_kingDog.backtracking._15663_N과M_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int N, M;
    static int[] nums, selected;
    static boolean[] visited;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        N = Integer.parseInt(line1[0]);
        M = Integer.parseInt(line1[1]);
        nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        visited = new boolean[N];
        selected = new int[M];

        backtracking(0);
        System.out.print(result);
    }

    static void backtracking(int depth){
        if (depth == M) {
            for (int num : selected) {
                result.append(num).append(" ");
            }
            result.append("\n");
            return;
        }

        int preNumber = 0;
        for (int i = 0; i < N; i++) {
            if (!visited[i] && preNumber != nums[i]) {
                visited[i] = true;
                selected[depth] = nums[i];
                preNumber = nums[i];
                backtracking(depth + 1);
                visited[i] = false;
            }
        }
    }

}