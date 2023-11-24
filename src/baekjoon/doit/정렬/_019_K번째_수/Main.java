package baekjoon.doit.정렬._019_K번째_수; // BOJ11004 - S5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private int partition(int[] arr, int s, int e) {
        if (s + 1 == e) {
            if (arr[s] > arr[e]) {
                swap(arr, s, e);
            }
            return e;
        }
        int m = (s + e) / 2;
        swap(arr, s, m);
        int pivot = arr[s];
        int i = s + 1, j = e;
        while (i <= j) {
            while (pivot < arr[j] && j > 0) {
                j--;
            }
            while (pivot > arr[i] && i < arr.length - 1) {
                i++;
            }
            if (i <= j) {
                swap(arr, i++, j--);
            }
        }
        arr[s] = arr[j];
        arr[j] = pivot;
        return j;
    }

    private void quickSort(int[] arr, int s, int e, int k) {
        if (s < e) {
            int pivot = partition(arr, s, e);
            if (pivot == k) {
                return;
            } else if (k < pivot) {
                quickSort(arr, s, pivot - 1, k);
            } else {
                quickSort(arr, pivot + 1, e, k);
            }
        }
    }

    private int solution(int n, int k, int[] numbers) {
//        Arrays.sort(numbers);
        quickSort(numbers, 0, n - 1, k - 1);
        return numbers[k - 1];
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] numbers = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(T.solution(n, k, numbers));
    }

}
