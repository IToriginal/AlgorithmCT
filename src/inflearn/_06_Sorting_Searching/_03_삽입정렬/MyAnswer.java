package inflearn._06_Sorting_Searching._03_삽입정렬;

import java.io.*;

public class MyAnswer {
    public void insertSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                if (data[j - 1] > data[j]) {
                    swap(data, j - 1, j);
                }
            }
        }
    }

    public void swap(int[] data, int a, int b) {
        int tmp = data[a];
        data[a] = data[b];
        data[b] = tmp;
    }

    public int[] solution(int[] arr) {
        insertSort(arr);
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
