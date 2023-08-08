package solvedAc.class2;

import java.io.*;
import java.util.*;

public class _11650_좌표정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] numbers = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(numbers[0]);
            arr[i][1] = Integer.parseInt(numbers[1]);
        }

        Arrays.sort(arr, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        for (int i = 0; i < n; i++) {
            result.append(arr[i][0] + " " + arr[i][1]).append("\n");
        }
        System.out.println(result);
    }
}
