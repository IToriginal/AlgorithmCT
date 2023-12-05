package inflearn.기본._02_Array._03_가위바위보;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int n;
    private static int[] dataA, dataB;

    private char[] soltuion() {
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            int a = dataA[i];
            int b = dataB[i];

            if (((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2))) {
                result[i] = 'A';
            } else if (a == b) {
                result[i] = 'D';
            } else {
                result[i] = 'B';
            }
        }
        return result;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dataA = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        dataB = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        for (char c : m.soltuion()) {
            System.out.println(c);
        }
    }

}
