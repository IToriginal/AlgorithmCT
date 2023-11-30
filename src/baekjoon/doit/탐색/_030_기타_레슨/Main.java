package baekjoon.doit.탐색._030_기타_레슨; // BOJ2343 - S1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int n, m;
    private static int[] arr;

    private int solution() {
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            if (start < arr[i]) {
                start = arr[i];
            }
            end += arr[i];
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (sum + arr[i] > mid) {
                    count++;
                    sum = 0;
                }
                sum += arr[i];
            }
            if (sum != 0) {
                count++;
            }
            if (count > m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }
}
