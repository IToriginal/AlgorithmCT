package inflearn.기본._02_Array._08_등수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    private static int n;
    private static int[] arr;

    private int[] solution() {
        int[] result = new int[n];
        int rank = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    rank++;
                }
            }
            result[i] = rank;
            rank = 1;
        }
        return result;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); // 5
        arr = Arrays.stream(br.readLine().split(" ")) // 87 89 92 100 76
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        for (int i : m.solution()) { // 4 3 2 1 5
            System.out.print(i + " ");
        }
    }

}
