package inflearn._08_DFS_BFS._04_중복순열구하기;

import java.io.*;
import java.util.*;

public class MyAnswer {
    private ArrayList<int[]> result = new ArrayList<>();

    private void DFS(int level, int n, int m, int[] permutation) {
        if (level == m) {
            int[] copy = new int[m];
            System.arraycopy(permutation, 0, copy, 0, m);
            result.add(copy);
        } else {
            for (int i = 1; i <= n; i++) {
                permutation[level] = i;
                DFS(level + 1, n, m, permutation);
            }
        }
    }

    public ArrayList<int[]> solution(int n, int m) {
        int[] permutation = new int[m];
        DFS(0, n, m, permutation);
        return result;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        for (int[] x : T.solution(n, m)) {
            for (int num : x) System.out.print(num + " ");
            System.out.println();
        }
    }
}
