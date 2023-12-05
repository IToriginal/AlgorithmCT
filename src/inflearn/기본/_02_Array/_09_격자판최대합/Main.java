package inflearn.기본._02_Array._09_격자판최대합;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {

    private static int n;
    private static int[][] matrix;

    private int solution() {
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, calculateRowSum(i));
            answer = Math.max(answer, calculateColSum(i));
        }
        answer = Math.max(answer, calculateDiaRightSum());
        answer = Math.max(answer, calculateDiaLeftSum());
        return answer;
    }

    private int calculateRowSum(int row) {
        return Arrays.stream(matrix[row]) // 행의 합 '-'
                .sum();
    }

    private int calculateColSum(int col) { // 열의 합 '|'
        return Arrays.stream(matrix)
                .mapToInt(row -> row[col])
                .sum();
    }

    private int calculateDiaRightSum() { // 대각선의 합 '\'
        return IntStream.range(0, n)
                .map(i -> matrix[i][i])
                .sum();
    }

    private int calculateDiaLeftSum() { // 대각선의 합 '/'
        return IntStream.range(0, n)
                .map(i -> matrix[i][n - i - 1])
                .sum();
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
