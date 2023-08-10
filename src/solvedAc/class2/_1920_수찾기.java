package solvedAc.class2;

import java.io.*;
import java.util.*;

public class _1920_수찾기 {

    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        String[] inputA = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputA[i]);
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        String[] inputX = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {
            int number = Integer.parseInt(inputX[i]);
            if (binarySearch(number) >= 0) {
                result.append(1).append('\n');
            } else {
                result.append(0).append('\n');
            }
        }
        System.out.println(result);
    }

    public static int binarySearch(int key) {

        int leftPoint = 0;
        int rightPoint = arr.length - 1;

        while (leftPoint <= rightPoint) {
            int midPoint = (leftPoint + rightPoint) / 2;

            if (key < arr[midPoint]) {
                rightPoint = midPoint - 1;
            } else if (key > arr[midPoint]) {
                leftPoint = midPoint + 1;
            } else {
                return midPoint;
            }
        }
        return -1;
    }
}