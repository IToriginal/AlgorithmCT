package baekjoon.doit.탐색._031_K번째_수; // BOJ1300 - G1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int n, k;

    private long solution() {
        long start = 1;
        long end = k;
        long ans = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long cnt = 0;
            for (int i = 1; i <= n; i++) {
                cnt += Math.min(mid / i, n);
            }
            if (cnt < k) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
