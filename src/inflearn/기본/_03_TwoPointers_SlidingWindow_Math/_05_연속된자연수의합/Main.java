package inflearn.기본._03_TwoPointers_SlidingWindow_Math._05_연속된자연수의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private int n;

    private int solution() {
        int count = 0, sum = 0, start = 0;

        int[] numbers = new int[n];
        for (int i = 1; i <= n; i++) {
            numbers[i - 1] = i;
        }

        for (int end = 0; end < n; end++) {
            sum += numbers[end];
            while (sum > n && start <= end) {
                sum -= numbers[start];
                start++;
            }
            if (sum == n) {
                count++;
            }
        }
        return count - 1; // 자기 자신 (ex:15 제외)
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
