package inflearn.기본._03_TwoPointers_SlidingWindow_Math._01_두배열합치기;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public int[] solution(int n, int m, int[] arr1, int[] arr2) {
        int[] answer = new int[n + m];
        for (int i = 0; i < n; i++) {
            answer[i] = arr1[i];
        }

        for (int i = n; i < n + m; i++) {
            answer[i] = arr2[i - n];
        }

        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 3
        String[] input1 = br.readLine().split(" "); // 1 3 5
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }

        int m = Integer.parseInt(br.readLine()); // 5
        String[] input2 = br.readLine().split(" "); // 2 3 6 7 9
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }

        for (int x : T.solution(n, m, arr1, arr2)) { // 1 2 3 3 5 6 7 9
            System.out.print(x + " ");
        }
    }
}
