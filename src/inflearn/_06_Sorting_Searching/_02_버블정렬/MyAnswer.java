package inflearn._06_Sorting_Searching._02_버블정렬;

import java.io.*;
import java.util.Arrays;

public class MyAnswer {
    public void bubbleSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                int tmp = 0;
                int target = j + 1;
                if (data[j] > data[target]) {
                    tmp = data[j];
                    data[j] = data[target];
                    data[target] = tmp;
                }
            }
        }
    }

    public int[] solution(int[] arr) {
        bubbleSort(arr);
        return arr;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        for (int x : T.solution(arr)) {
            System.out.print(x + " ");
        }
    }
}