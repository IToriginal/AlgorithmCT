package baekjoon.doit.탐색._029_수_찾기; // BOJ1920 - S4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int n, m;
    private static int[] arr, targetArr;

    private int[] solution() {
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            boolean find = false;
            int start = 0;
            int end = n - 1;

            while (start <= end) {
                int mid = (start + end) / 2;
                int target = targetArr[i];

                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    find = true;
                    break;
                }
            }
            result[i] = find ? 1 : 0;
        }
        return result;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        m = Integer.parseInt(br.readLine());
        targetArr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        Arrays.stream(m.solution()).forEach(System.out::println);
    }

}
