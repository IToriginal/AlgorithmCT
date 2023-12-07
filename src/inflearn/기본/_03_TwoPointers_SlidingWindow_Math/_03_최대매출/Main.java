package inflearn.기본._03_TwoPointers_SlidingWindow_Math._03_최대매출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private int n, k;
    private int[] data;

    private int solution() {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += data[i];
        }

        int maxSum = sum;
        for (int i = k; i < n; i++) {
            sum += (data[i] - data[i - k]);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        n = Integer.parseInt(line1[0]);
        k = Integer.parseInt(line1[1]);
        data = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
