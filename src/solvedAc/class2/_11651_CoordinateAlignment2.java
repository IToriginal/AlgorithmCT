package solvedAc.class2;

import java.io.*;
import java.util.*;

public class _11651_CoordinateAlignment2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        int[][] coordinate = new int[testCase][2];

        for (int i = 0; i < testCase; i++) {
            String[] numbers = br.readLine().split(" ");

            int x = Integer.parseInt(numbers[0]);
            int y = Integer.parseInt(numbers[1]);

            coordinate[i][0] = x;
            coordinate[i][1] = y;
        }

        Arrays.sort(coordinate, (e1, e2) -> {
            if (e1[1] == e2[1]) {
                return e1[0] - e2[0];
            } else {
                return e1[1] - e2[1];
            }
        });

        for (int i = 0; i < testCase; i++) {
            result.append(coordinate[i][0]).append(" ").append(coordinate[i][1]).append("\n");
        }
        System.out.println(result);
    }
}
