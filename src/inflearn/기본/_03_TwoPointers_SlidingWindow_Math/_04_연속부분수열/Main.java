package inflearn.기본._03_TwoPointers_SlidingWindow_Math._04_연속부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private int n, m;
    private int[] arr;

    private int solution() {
        int count = 0, sum = 0, start = 0;

        for (int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum > m && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == m) {
                count++;
            }
        }

        return count;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        String[] line2 = br.readLine().split(" ");
        n = Integer.parseInt(line1[0]);
        m = Integer.parseInt(line1[1]);
        arr = Arrays.stream(line2)
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
