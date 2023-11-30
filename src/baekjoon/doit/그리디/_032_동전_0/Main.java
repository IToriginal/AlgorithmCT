package baekjoon.doit.그리디._032_동전_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int n, k;
    private static int[] arr;

    private int solution() {
        int count = 0;
        Arrays.sort(arr);
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] <= k) {
                count += (k / arr[i]);
                k %= arr[i];
            }
        }
        return count;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] info = br.readLine().split(" ");
        n = Integer.parseInt(info[0]); // 10
        k = Integer.parseInt(info[1]); // 4200
        arr = new int[n]; // arr = [1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000]
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
