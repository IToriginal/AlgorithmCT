package inflearn._03_TwoPointers_SlidingWindow_Math._05_연속된자연수의합;

import java.io.*;

public class MyAnswer {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            int sum = 0;
            sum += i;
            for (int j = i + 1; j < n; j++) {
                sum += j;
                if (sum == n) count++;
                else if (sum > n) {
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(T.solution(n));
    }
}
