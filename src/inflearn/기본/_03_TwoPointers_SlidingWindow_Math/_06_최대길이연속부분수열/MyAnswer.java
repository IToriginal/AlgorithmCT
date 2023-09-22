package inflearn.기본._03_TwoPointers_SlidingWindow_Math._06_최대길이연속부분수열;

import java.io.*;

public class MyAnswer {
    public int solution(int n, int k, int[] arr) {
        int maxCnt = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            int transferCnt = k;
            if (arr[i] == 1) count++;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] == 0 && transferCnt > 0) {
                    transferCnt--;
                    count++;
                }
                else if (arr[j] == 1) count++;
                else break;
            }

            if (maxCnt < count) maxCnt = count;
        }

        return maxCnt;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

        int n = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input1[1]);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }

        System.out.println(T.solution(n, k, arr));
    }
}
