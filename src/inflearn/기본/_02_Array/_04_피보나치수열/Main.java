package inflearn.기본._02_Array._04_피보나치수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int n;

    private int[] solution() {
        int[] result = new int[n];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        for (int num : m.solution()) {
            System.out.print(num + " ");
        }
    }

}
