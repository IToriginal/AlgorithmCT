package baekjoon.doit.정렬._018_ATM; // BOJ11399 - S4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private int[] insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int insertIndex = i;
            int insertValue = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    insertIndex = j + 1;
                    break;
                }
                if (j == 0) {
                    insertIndex = 0;
                }
            }
            for (int j = i; j > insertIndex; j--) {
                arr[j] = arr[j - 1];
            }
            arr[insertIndex] = insertValue;
        }
        return arr;
    }

    public int solution(int n, int[] money) {
        // Arrays.sort(money);
        insertSort(money);

        int[] prefixSum = new int[n];
        Arrays.setAll(prefixSum, i -> Arrays.stream(money, 0, i + 1)
                .sum());

        return Arrays.stream(prefixSum)
                .sum();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] money = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(T.solution(n, money));
    }

}
