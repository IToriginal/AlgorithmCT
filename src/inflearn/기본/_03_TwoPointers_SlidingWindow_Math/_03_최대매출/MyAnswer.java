package inflearn.기본._03_TwoPointers_SlidingWindow_Math._03_최대매출;

import java.io.*;

public class MyAnswer {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;

        for (int i = 0; i < n - k; i++) {
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            if (sum > answer) {
                answer = sum;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input1[1]);

        int[] arr = new int[n];
        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }

        System.out.println(T.solution(n, k, arr));
    }
}
