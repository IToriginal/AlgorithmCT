package inflearn.기본._03_TwoPointers_SlidingWindow_Math._04_연속부분수열;

import java.io.*;

public class MyAnswer {
    public int solution(int n, int m, int[] arr) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            sum += arr[i];
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == m) count++;
                else if (sum > m) {
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

        int n = Integer.parseInt(input1[0]);
        int m = Integer.parseInt(input1[1]);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }

        System.out.println(T.solution(n, m, arr));
    }
}
