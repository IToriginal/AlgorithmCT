package inflearn._06_Sorting_Searching._07_좌표정렬;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public int[][] solution(int n, int[][] arr) {
        Arrays.sort(arr, (e1, e2) -> {
            return e1[0] != e2[0] ? e1[0] - e2[0] : e1[1] - e2[1];
        });
        return arr;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }

        for (int[] a : T.solution(n, arr)) System.out.println(a[0] + " " + a[1]);
    }
}
